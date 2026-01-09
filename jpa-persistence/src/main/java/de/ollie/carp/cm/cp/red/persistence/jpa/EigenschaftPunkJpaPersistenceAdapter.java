package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.EigenschaftPunkPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.EigenschaftPunkDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.EigenschaftPunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.PunkDboRepository;
import jakarta.inject.Named;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
class EigenschaftPunkPersistenceJpaAdapter implements EigenschaftPunkPersistencePort {

	private final DboFactory dboFactory;
	private final EigenschaftPunkDboMapper mapper;
	private final EigenschaftPunkDboRepository repository;
	private final PunkDboRepository punkRepository;

	@Override
	public EigenschaftPunk create(Eigenschaft eigenschaft, Punk punk, int wert) {
		return mapper.toModel(repository.save(dboFactory.createEigenschaftPunk(eigenschaft.getId(), punk.getId(), wert)));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Map<Eigenschaft, EigenschaftPunk> findAllByPunkId(UUID punkId) {
		PunkDbo punk = punkRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("punk not found with id:" + punkId));
		Map<Eigenschaft, EigenschaftPunk> m = new HashMap<>();
		repository.findAllByPunk(punk).stream().map(mapper::toModel).forEach(model -> m.put(model.getEigenschaft(), model));
		return m;
	}

	@Override
	public Optional<EigenschaftPunk> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<EigenschaftPunk> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public EigenschaftPunk update(EigenschaftPunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
