package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.AusruestungsgegenstandPunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.AusruestungsgegenstandPunkPersistencePort;
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
class AusruestungsgegenstandPunkServiceImpl implements AusruestungsgegenstandPunkService {

	private final AusruestungsgegenstandPunkPersistencePort ausruestungsgegenstandPunkPersistencePort;

	@Override
	public AusruestungsgegenstandPunk createAusruestungsgegenstandPunk(
		Ausruestungsgegenstand ausruestungsgegenstand,
		Punk punk
	) {
		return ausruestungsgegenstandPunkPersistencePort.create(ausruestungsgegenstand, punk);
	}

	@Override
	public void deleteAusruestungsgegenstandPunk(UUID id) {
		ausruestungsgegenstandPunkPersistencePort.deleteById(id);
	}

	@Override
	public Optional<AusruestungsgegenstandPunk> findById(UUID id) {
		return ausruestungsgegenstandPunkPersistencePort.findById(id);
	}

	@Override
	public List<AusruestungsgegenstandPunk> listAusruestungsgegenstandPunks() {
		return ausruestungsgegenstandPunkPersistencePort.list();
	}

	@Override
	public AusruestungsgegenstandPunk updateAusruestungsgegenstandPunk(AusruestungsgegenstandPunk toSave) {
		return ausruestungsgegenstandPunkPersistencePort.update(toSave);
	}
}
