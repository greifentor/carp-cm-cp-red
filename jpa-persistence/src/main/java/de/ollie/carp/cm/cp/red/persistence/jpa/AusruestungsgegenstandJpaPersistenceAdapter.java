package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.AusruestungsgegenstandPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.AusruestungsgegenstandDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.AusruestungsgegenstandDboRepository;
import jakarta.inject.Named;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
@Named
@RequiredArgsConstructor
class AusruestungsgegenstandPersistenceJpaAdapter implements AusruestungsgegenstandPersistencePort {

	private final DboFactory dboFactory;
	private final AusruestungsgegenstandDboMapper mapper;
	private final AusruestungsgegenstandDboRepository repository;

	@Override
	public Ausruestungsgegenstand create(String name) {
		return mapper.toModel(repository.save(dboFactory.createAusruestungsgegenstand(name)));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<Ausruestungsgegenstand> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<Ausruestungsgegenstand> list() {
		return repository.findAllOrdered().stream().map(mapper::toModel).toList();
	}

	@Override
	public Ausruestungsgegenstand update(Ausruestungsgegenstand toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
