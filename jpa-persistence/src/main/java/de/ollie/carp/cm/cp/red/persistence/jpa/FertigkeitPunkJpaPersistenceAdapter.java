package de.ollie.carp.cm.cp.red.persistence.jpa;

import static de.ollie.baselib.util.Check.ensure;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.FertigkeitPunkPersistencePort;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.mapper.FertigkeitPunkDboMapper;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.FertigkeitPunkDboRepository;
import de.ollie.carp.cm.cp.red.persistence.jpa.repository.PunkDboRepository;
import jakarta.inject.Named;
import java.util.List;
import java.util.NoSuchElementException;
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
class FertigkeitPunkPersistenceJpaAdapter implements FertigkeitPunkPersistencePort {

	private final DboFactory dboFactory;
	private final FertigkeitPunkDboMapper mapper;
	private final FertigkeitPunkDboRepository repository;
	private final PunkDboRepository punkRepository;

	@Override
	public FertigkeitPunk create(Fertigkeit fertigkeit, Punk punk, int wert) {
		return mapper.toModel(repository.save(dboFactory.createFertigkeitPunk(fertigkeit.getId(), punk.getId(), wert)));
	}

	@Override
	public void deleteById(UUID id) {
		ensure(id != null, "id cannot be null!");
		repository.deleteById(id);
	}

	@Override
	public List<FertigkeitPunk> findAllByPunkId(UUID punkId) {
		PunkDbo punk = punkRepository
			.findById(punkId)
			.orElseThrow(() -> new NoSuchElementException("punk not found id:" + punkId));
		return repository.findAllByPunk(punk).stream().map(mapper::toModel).toList();
	}

	@Override
	public Optional<FertigkeitPunk> findById(UUID id) {
		ensure(id != null, "id cannot be null!");
		return repository.findById(id).map(mapper::toModel);
	}

	@Override
	public List<FertigkeitPunk> list() {
		return repository.findAll().stream().map(mapper::toModel).toList();
	}

	@Override
	public FertigkeitPunk update(FertigkeitPunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
