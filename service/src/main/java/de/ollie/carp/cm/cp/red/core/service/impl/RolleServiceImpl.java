package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.RolleService;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.RollePersistencePort;
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
class RolleServiceImpl implements RolleService {

	private final RollePersistencePort rollePersistencePort;

	@Override
	public Rolle createRolle(String name, Fertigkeit rollenfertigkeit) {
		return rollePersistencePort.create(name, rollenfertigkeit);
	}

	@Override
	public void deleteRolle(UUID id) {
		rollePersistencePort.deleteById(id);
	}

	@Override
	public Optional<Rolle> findById(UUID id) {
		return rollePersistencePort.findById(id);
	}

	@Override
	public List<Rolle> listRolles() {
		return rollePersistencePort.list();
	}

	@Override
	public Rolle updateRolle(Rolle toSave) {
		return rollePersistencePort.update(toSave);
	}
}
