package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitPunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.FertigkeitPunkPersistencePort;
import jakarta.inject.Named;
import java.util.List;
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
class FertigkeitPunkServiceImpl implements FertigkeitPunkService {

	private final FertigkeitPunkPersistencePort fertigkeitPunkPersistencePort;

	@Override
	public FertigkeitPunk createFertigkeitPunk(Fertigkeit fertigkeit, Punk punk, int wert) {
		return fertigkeitPunkPersistencePort.create(fertigkeit, punk, wert);
	}

	@Override
	public void deleteFertigkeitPunk(UUID id) {
		fertigkeitPunkPersistencePort.deleteById(id);
	}

	@Override
	public Optional<FertigkeitPunk> findById(UUID id) {
		return fertigkeitPunkPersistencePort.findById(id);
	}

	@Override
	public List<FertigkeitPunk> listFertigkeitPunks() {
		return fertigkeitPunkPersistencePort.list();
	}

	@Override
	public FertigkeitPunk updateFertigkeitPunk(FertigkeitPunk toSave) {
		return fertigkeitPunkPersistencePort.update(toSave);
	}
}
