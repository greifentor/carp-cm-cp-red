package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.Waffe;
import de.ollie.carp.vtt.core.service.model.Fertigkeit;
import de.ollie.carp.vtt.core.service.port.persistence.WaffePersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.WaffeDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.WaffeDboRepository;
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
public class WaffeJpaPersistenceAdapter implements WaffePersistencePort {

	private final WaffeDboMapper mapper;
	private final WaffeDboRepository repository;

	@Override
	public Waffe create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<Waffe> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Waffe> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Waffe update(Waffe toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
