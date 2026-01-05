package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.EigenschaftPunkPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.EigenschaftPunkDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.EigenschaftPunkDboRepository;
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
class EigenschaftPunkPersistenceJpaAdapter implements EigenschaftPunkPersistencePort {

	private final DboFactory dboFactory;
	private final EigenschaftPunkDboMapper mapper;
	private final EigenschaftPunkDboRepository repository;

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
