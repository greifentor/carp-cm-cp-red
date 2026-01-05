package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.WaffePersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.WaffeDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.WaffeDboRepository;
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
class WaffePersistenceJpaAdapter implements WaffePersistencePort {

	private final DboFactory dboFactory;
	private final WaffeDboMapper mapper;
	private final WaffeDboRepository repository;

	@Override
	public Waffe create(Fertigkeit fertigkeit, String name, String schaden) {
		return mapper.toModel(repository.save(dboFactory.createWaffe(fertigkeit.getId(), name, schaden)));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<Waffe> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<Waffe> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public Waffe update(Waffe toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
