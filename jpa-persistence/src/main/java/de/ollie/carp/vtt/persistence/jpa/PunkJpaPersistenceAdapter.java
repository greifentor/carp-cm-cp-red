package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.Punk;
import de.ollie.carp.vtt.core.service.model.Panzerung;
import de.ollie.carp.vtt.core.service.model.Panzerung;
import de.ollie.carp.vtt.core.service.model.Rolle;
import de.ollie.carp.vtt.core.service.port.persistence.PunkPersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.PunkDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.PunkDboRepository;
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
public class PunkJpaPersistenceAdapter implements PunkPersistencePort {

	private final PunkDboMapper mapper;
	private final PunkDboRepository repository;

	@Override
	public Punk create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<Punk> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Punk> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Punk update(Punk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
