package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.Panzerung;
import de.ollie.carp.vtt.core.service.port.persistence.PanzerungPersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.PanzerungDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.PanzerungDboRepository;
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
public class PanzerungJpaPersistenceAdapter implements PanzerungPersistencePort {

	private final PanzerungDboMapper mapper;
	private final PanzerungDboRepository repository;

	@Override
	public Panzerung create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<Panzerung> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Panzerung> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Panzerung update(Panzerung toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
