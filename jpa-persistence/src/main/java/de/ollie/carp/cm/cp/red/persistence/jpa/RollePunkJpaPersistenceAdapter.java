package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.RollePunkPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.RollePunkDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.RollePunkDboRepository;
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
class RollePunkPersistenceJpaAdapter implements RollePunkPersistencePort {

	private final DboFactory dboFactory;
	private final RollePunkDboMapper mapper;
	private final RollePunkDboRepository repository;

	@Override
	public RollePunk create(Punk punk, Rolle rolle) {
		return mapper.toModel(repository.save(dboFactory.createRollePunk(punk.getId(), rolle.getId())));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<RollePunk> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<RollePunk> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public RollePunk update(RollePunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
