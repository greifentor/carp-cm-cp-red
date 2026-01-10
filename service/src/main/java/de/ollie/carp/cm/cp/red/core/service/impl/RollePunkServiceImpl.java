package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.RollePunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.RollePunkPersistencePort;
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
class RollePunkServiceImpl implements RollePunkService {

	private final RollePunkPersistencePort rollePunkPersistencePort;

	@Override
	public RollePunk createRollePunk(Punk punk, Rolle rolle) {
		return rollePunkPersistencePort.create(punk, rolle);
	}

	@Override
	public void deleteRollePunk(UUID id) {
		rollePunkPersistencePort.deleteById(id);
	}

	@Override
	public List<RollePunk> findAllByPunk(Punk punk) {
		return rollePunkPersistencePort.findAllByPunk(punk);
	}

	@Override
	public Optional<RollePunk> findById(UUID id) {
		return rollePunkPersistencePort.findById(id);
	}

	@Override
	public List<RollePunk> listRollePunks() {
		return rollePunkPersistencePort.list();
	}

	@Override
	public RollePunk updateRollePunk(RollePunk toSave) {
		return rollePunkPersistencePort.update(toSave);
	}
}
