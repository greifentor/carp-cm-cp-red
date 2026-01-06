package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.PanzerungService;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.PanzerungPersistencePort;
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
class PanzerungServiceImpl implements PanzerungService {

	private final PanzerungPersistencePort panzerungPersistencePort;

	@Override
	public Panzerung createPanzerung(boolean koerperpanzerung, String name, int sw) {
		return panzerungPersistencePort.create(koerperpanzerung, name, sw);
	}

	@Override
	public void deletePanzerung(UUID id) {
		panzerungPersistencePort.deleteById(id);
	}

	@Override
	public Optional<Panzerung> findById(UUID id) {
		return panzerungPersistencePort.findById(id);
	}

	@Override
	public List<Panzerung> listPanzerungs() {
		return panzerungPersistencePort.list();
	}

	@Override
	public Panzerung updatePanzerung(Panzerung toSave) {
		return panzerungPersistencePort.update(toSave);
	}
}
