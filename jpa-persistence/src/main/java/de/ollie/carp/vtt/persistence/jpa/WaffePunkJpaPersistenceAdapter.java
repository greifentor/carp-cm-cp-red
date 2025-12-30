package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.WaffePunk;
import de.ollie.carp.vtt.core.service.model.Punk;
import de.ollie.carp.vtt.core.service.model.Waffe;
import de.ollie.carp.vtt.core.service.port.persistence.WaffePunkPersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.WaffePunkDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.WaffePunkDboRepository;
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
public class WaffePunkJpaPersistenceAdapter implements WaffePunkPersistencePort {

	private final WaffePunkDboMapper mapper;
	private final WaffePunkDboRepository repository;

	@Override
	public WaffePunk create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<WaffePunk> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<WaffePunk> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public WaffePunk update(WaffePunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
