package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandService;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.AusruestungsgegenstandPersistencePort;
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
class AusruestungsgegenstandServiceImpl implements AusruestungsgegenstandService {

	private final AusruestungsgegenstandPersistencePort ausruestungsgegenstandPersistencePort;

	@Override
	public Ausruestungsgegenstand createAusruestungsgegenstand(String name) {
		return ausruestungsgegenstandPersistencePort.create(name);
	}

	@Override
	public void deleteAusruestungsgegenstand(UUID id) {
		ausruestungsgegenstandPersistencePort.deleteById(id);
	}

	@Override
	public Optional<Ausruestungsgegenstand> findById(UUID id) {
		return ausruestungsgegenstandPersistencePort.findById(id);
	}

	@Override
	public List<Ausruestungsgegenstand> listAusruestungsgegenstands() {
		return ausruestungsgegenstandPersistencePort.list();
	}

	@Override
	public Ausruestungsgegenstand updateAusruestungsgegenstand(Ausruestungsgegenstand toSave) {
		return ausruestungsgegenstandPersistencePort.update(toSave);
	}
}
