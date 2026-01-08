package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.FertigkeitPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.FertigkeitDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.FertigkeitDboRepository;
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
class FertigkeitPersistenceJpaAdapter implements FertigkeitPersistencePort {

	private final DboFactory dboFactory;
	private final FertigkeitDboMapper mapper;
	private final FertigkeitDboRepository repository;

	@Override
	public Fertigkeit create(Eigenschaft eigenschaft, String name, boolean rollenfertigkeit) {
		return mapper.toModel(repository.save(dboFactory.createFertigkeit(eigenschaft.getId(), name, rollenfertigkeit)));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<Fertigkeit> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<Fertigkeit> list() {
		return repository.findAllOrdered().stream().map(mapper::toModel).toList();
	}

	@Override
	public Fertigkeit update(Fertigkeit toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
