package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.CyberwarePunkPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.CyberwarePunkDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.CyberwarePunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.PunkDboRepository;
import jakarta.inject.Named;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
class CyberwarePunkPersistenceJpaAdapter implements CyberwarePunkPersistencePort {

	private final DboFactory dboFactory;
	private final CyberwarePunkDboMapper mapper;
	private final CyberwarePunkDboRepository repository;
	private final PunkDboRepository punkRepository;

	@Override
	public CyberwarePunk create(Cyberware cyberware, Punk punk) {
		return mapper.toModel(repository.save(dboFactory.createCyberwarePunk(cyberware.getId(), punk.getId())));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public List<CyberwarePunk> findAllByPunkId(UUID punkId) {
		PunkDbo punk = punkRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("punk not found id:" + punkId));
		return repository.findAllByPunk(punk).stream().map(mapper::toModel).toList();
	}

	@Override
	public Optional<CyberwarePunk> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<CyberwarePunk> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public CyberwarePunk update(CyberwarePunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
