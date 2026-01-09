package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.AusruestungsgegenstandPunkPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.AusruestungsgegenstandPunkDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.AusruestungsgegenstandPunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.PunkDboRepository;
import jakarta.inject.Named;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
class AusruestungsgegenstandPunkPersistenceJpaAdapter implements AusruestungsgegenstandPunkPersistencePort {

	private final DboFactory dboFactory;
	private final AusruestungsgegenstandPunkDboMapper mapper;
	private final AusruestungsgegenstandPunkDboRepository repository;
	private final PunkDboRepository punkRepository;

	@Override
	public AusruestungsgegenstandPunk create(Ausruestungsgegenstand ausruestungsgegenstand, Punk punk) {
		return mapper.toModel(
			repository.save(dboFactory.createAusruestungsgegenstandPunk(ausruestungsgegenstand.getId(), punk.getId()))
		);
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public List<AusruestungsgegenstandPunk> findAllByPunkId(UUID punkId) {
		PunkDbo punk = punkRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("punk not found id:" + punkId));
		return repository.findAllByPunk(punk).stream().map(mapper::toModel).toList();
	}

	@Override
	public Optional<AusruestungsgegenstandPunk> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<AusruestungsgegenstandPunk> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public AusruestungsgegenstandPunk update(AusruestungsgegenstandPunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
