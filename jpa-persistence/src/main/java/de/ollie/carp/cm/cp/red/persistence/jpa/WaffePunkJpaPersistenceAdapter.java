package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.WaffePunkPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.WaffePunkDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.WaffePunkDboRepository;
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
class WaffePunkPersistenceJpaAdapter implements WaffePunkPersistencePort {

	private final DboFactory dboFactory;
	private final WaffePunkDboMapper mapper;
	private final WaffePunkDboRepository repository;

	@Override
	public WaffePunk create(Punk punk, Waffe waffe) {
		return mapper.toModel(repository.save(dboFactory.createWaffePunk(punk.getId(), waffe.getId())));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<WaffePunk> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<WaffePunk> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public WaffePunk update(WaffePunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
