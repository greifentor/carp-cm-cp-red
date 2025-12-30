package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.FertigkeitPunk;
import de.ollie.carp.vtt.core.service.model.Fertigkeit;
import de.ollie.carp.vtt.core.service.model.Punk;
import de.ollie.carp.vtt.core.service.port.persistence.FertigkeitPunkPersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.FertigkeitPunkDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.FertigkeitPunkDboRepository;
import jakarta.inject.Named;
import java.util.List;
import java.util.Optional;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
@Named
@RequiredArgsConstructor
public class FertigkeitPunkJpaPersistenceAdapter implements FertigkeitPunkPersistencePort {

	private final FertigkeitPunkDboMapper mapper;
	private final FertigkeitPunkDboRepository repository;

	@Override
	public FertigkeitPunk create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<FertigkeitPunk> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<FertigkeitPunk> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public FertigkeitPunk update(FertigkeitPunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
