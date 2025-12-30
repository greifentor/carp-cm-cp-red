package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.Eigenschaft;
import de.ollie.carp.vtt.core.service.port.persistence.EigenschaftPersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.EigenschaftDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.EigenschaftDboRepository;
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
public class EigenschaftJpaPersistenceAdapter implements EigenschaftPersistencePort {

	private final EigenschaftDboMapper mapper;
	private final EigenschaftDboRepository repository;

	@Override
	public Eigenschaft create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<Eigenschaft> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Eigenschaft> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Eigenschaft update(Eigenschaft toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
