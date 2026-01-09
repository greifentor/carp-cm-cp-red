package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.CyberwareService;
import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.CyberwarePersistencePort;
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
class CyberwareServiceImpl implements CyberwareService {

	private final CyberwarePersistencePort cyberwarePersistencePort;

	@Override
	public Cyberware createCyberware(String beschreibung, String name) {
		return cyberwarePersistencePort.create(beschreibung, name);
	}

	@Override
	public void deleteCyberware(UUID id) {
		cyberwarePersistencePort.deleteById(id);
	}

	@Override
	public Optional<Cyberware> findById(UUID id) {
		return cyberwarePersistencePort.findById(id);
	}

	@Override
	public List<Cyberware> listCyberwares() {
		return cyberwarePersistencePort.list();
	}

	@Override
	public Cyberware updateCyberware(Cyberware toSave) {
		return cyberwarePersistencePort.update(toSave);
	}
}
