package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.FertigkeitService;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.FertigkeitPersistencePort;
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
class FertigkeitServiceImpl implements FertigkeitService {

	private final FertigkeitPersistencePort fertigkeitPersistencePort;

	@Override
	public Fertigkeit createFertigkeit(Eigenschaft eigenschaft, String name, boolean rollenfertigkeit) {
		return fertigkeitPersistencePort.create(eigenschaft, name, rollenfertigkeit);
	}

	@Override
	public void deleteFertigkeit(UUID id) {
		fertigkeitPersistencePort.deleteById(id);
	}

	@Override
	public Optional<Fertigkeit> findById(UUID id) {
		return fertigkeitPersistencePort.findById(id);
	}

	@Override
	public List<Fertigkeit> listFertigkeits() {
		return fertigkeitPersistencePort.list();
	}

	@Override
	public Fertigkeit updateFertigkeit(Fertigkeit toSave) {
		return fertigkeitPersistencePort.update(toSave);
	}
}
