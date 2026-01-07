package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.exception.TooManyElementsException;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.PunkPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.PunkDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.PunkDboRepository;
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
class PunkPersistenceJpaAdapter implements PunkPersistencePort {

	private final DboFactory dboFactory;
	private final PunkDboMapper mapper;
	private final PunkDboRepository repository;

	@Override
	public Punk create(String name, Panzerung panzerungKoerper, Panzerung panzerungKopf) {
		return mapper.toModel(
			repository.save(dboFactory.createPunk(name, panzerungKoerper.getId(), panzerungKopf.getId()))
		);
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public Optional<Punk> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<Punk> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public Punk update(Punk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
