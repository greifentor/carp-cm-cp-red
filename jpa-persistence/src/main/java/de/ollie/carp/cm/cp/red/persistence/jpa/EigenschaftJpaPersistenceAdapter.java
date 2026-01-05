package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.EigenschaftPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.EigenschaftDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.EigenschaftDboRepository;
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
class EigenschaftPersistenceJpaAdapter implements EigenschaftPersistencePort {

	private final DboFactory dboFactory;
	private final EigenschaftDboMapper mapper;
	private final EigenschaftDboRepository repository;

	@Override
	public Eigenschaft create(String name) {
		return mapper.toModel(repository.save(dboFactory.createEigenschaft(name)));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<Eigenschaft> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<Eigenschaft> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public Eigenschaft update(Eigenschaft toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
