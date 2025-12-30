package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.vtt.core.service.port.persistence.AusruestungsgegenstandPersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.AusruestungsgegenstandDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.AusruestungsgegenstandDboRepository;
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
public class AusruestungsgegenstandJpaPersistenceAdapter implements AusruestungsgegenstandPersistencePort {

	private final AusruestungsgegenstandDboMapper mapper;
	private final AusruestungsgegenstandDboRepository repository;

	@Override
	public Ausruestungsgegenstand create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<Ausruestungsgegenstand> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Ausruestungsgegenstand> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Ausruestungsgegenstand update(Ausruestungsgegenstand toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
