package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.vtt.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.vtt.core.service.model.Punk;
import de.ollie.carp.vtt.core.service.port.persistence.AusruestungsgegenstandPunkPersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.AusruestungsgegenstandPunkDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.AusruestungsgegenstandPunkDboRepository;
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
public class AusruestungsgegenstandPunkJpaPersistenceAdapter implements AusruestungsgegenstandPunkPersistencePort {

	private final AusruestungsgegenstandPunkDboMapper mapper;
	private final AusruestungsgegenstandPunkDboRepository repository;

	@Override
	public AusruestungsgegenstandPunk create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<AusruestungsgegenstandPunk> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<AusruestungsgegenstandPunk> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AusruestungsgegenstandPunk update(AusruestungsgegenstandPunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
