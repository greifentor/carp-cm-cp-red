package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.WaffePunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.WaffePunkPersistencePort;
import jakarta.inject.Named;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
class WaffePunkServiceImpl implements WaffePunkService {

	private final WaffePunkPersistencePort waffePunkPersistencePort;

	@Override
	public WaffePunk createWaffePunk(Punk punk, Waffe waffe) {
		return waffePunkPersistencePort.create(punk, waffe);
	}

	@Override
	public void deleteWaffePunk(UUID id) {
		waffePunkPersistencePort.deleteById(id);
	}

	@Override
	public List<WaffePunk> findAllByPunkId(UUID punkId) {
		return waffePunkPersistencePort.findAllByPunkId(punkId);
	}

	@Override
	public Optional<WaffePunk> findById(UUID id) {
		return waffePunkPersistencePort.findById(id);
	}

	@Override
	public List<WaffePunk> listWaffePunks() {
		return waffePunkPersistencePort.list();
	}

	@Override
	public WaffePunk updateWaffePunk(WaffePunk toSave) {
		return waffePunkPersistencePort.update(toSave);
	}
}
