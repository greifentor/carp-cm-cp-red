package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.CyberwarePersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.CyberwareDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.CyberwareDboRepository;
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
class CyberwarePersistenceJpaAdapter implements CyberwarePersistencePort {

	private final DboFactory dboFactory;
	private final CyberwareDboMapper mapper;
	private final CyberwareDboRepository repository;

	@Override
	public Cyberware create(String beschreibung, String name) {
		return mapper.toModel(repository.save(dboFactory.createCyberware(beschreibung, name)));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<Cyberware> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<Cyberware> list() {
		return repository.findAllOrdered().stream().map(mapper::toModel).toList();
	}

	@Override
	public Cyberware update(Cyberware toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
