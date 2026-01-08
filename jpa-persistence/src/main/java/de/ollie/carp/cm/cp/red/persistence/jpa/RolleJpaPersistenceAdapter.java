package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.RollePersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.RolleDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.RolleDboRepository;
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
class RollePersistenceJpaAdapter implements RollePersistencePort {

	private final DboFactory dboFactory;
	private final RolleDboMapper mapper;
	private final RolleDboRepository repository;

	@Override
	public Rolle create(String name, Fertigkeit rollenfertigkeit) {
		return mapper.toModel(repository.save(dboFactory.createRolle(name, rollenfertigkeit.getId())));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<Rolle> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<Rolle> list() {
		return repository.findAllOrdered().stream().map(mapper::toModel).toList();
	}

	@Override
	public Rolle update(Rolle toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
