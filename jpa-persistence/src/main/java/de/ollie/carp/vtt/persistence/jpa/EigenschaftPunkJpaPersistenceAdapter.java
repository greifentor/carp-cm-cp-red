package de.ollie.carp.vtt.persistence.jpa;

import de.ollie.carp.vtt.core.service.model.EigenschaftPunk;
import de.ollie.carp.vtt.core.service.model.Eigenschaft;
import de.ollie.carp.vtt.core.service.model.Punk;
import de.ollie.carp.vtt.core.service.port.persistence.EigenschaftPunkPersistencePort;
import de.ollie.carp.vtt.persistence.jpa.mapper.EigenschaftPunkDboMapper;
import de.ollie.carp.vtt.persistence.jpa.repository.EigenschaftPunkDboRepository;
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
public class EigenschaftPunkJpaPersistenceAdapter implements EigenschaftPunkPersistencePort {

	private final EigenschaftPunkDboMapper mapper;
	private final EigenschaftPunkDboRepository repository;

	@Override
	public EigenschaftPunk create(String name, byte[] image) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteById(UUID id) {
		// TODO Auto-generated method stub
	}

	@Override
	public Optional<EigenschaftPunk> findById(UUID id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<EigenschaftPunk> list() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public EigenschaftPunk update(EigenschaftPunk toSave) {
		return mapper.toModel(repository.save(mapper.toDbo(toSave)));
	}
}
