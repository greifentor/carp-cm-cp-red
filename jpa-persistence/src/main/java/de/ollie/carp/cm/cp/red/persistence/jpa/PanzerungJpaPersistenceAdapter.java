package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.PanzerungPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.PanzerungDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.PanzerungDboRepository;
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
class PanzerungPersistenceJpaAdapter implements PanzerungPersistencePort {

	private final DboFactory dboFactory;
	private final PanzerungDboMapper mapper;
	private final PanzerungDboRepository repository;

	@Override
	public Panzerung create(boolean koerperpanzerung, String name, int sw) {
		return mapper.toModel(repository.save(dboFactory.createPanzerung(koerperpanzerung, name, sw)));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<Panzerung> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<Panzerung> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public Panzerung update(Panzerung toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
