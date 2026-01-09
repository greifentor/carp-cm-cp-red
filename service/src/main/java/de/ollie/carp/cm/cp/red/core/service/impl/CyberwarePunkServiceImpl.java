package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.CyberwarePunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.CyberwarePunkPersistencePort;
import jakarta.inject.Named;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.RequiredArgsConstructor;

@Named
@RequiredArgsConstructor
class CyberwarePunkServiceImpl implements CyberwarePunkService {

	private final CyberwarePunkPersistencePort cyberwarePunkPersistencePort;

	@Override
	public CyberwarePunk createCyberwarePunk(Cyberware cyberware, Punk punk) {
		return cyberwarePunkPersistencePort.create(cyberware, punk);
	}

	@Override
	public void deleteCyberwarePunk(UUID id) {
		cyberwarePunkPersistencePort.deleteById(id);
	}

	@Override
	public List<CyberwarePunk> findAllByPunkId(UUID punkId) {
		return cyberwarePunkPersistencePort.findAllByPunkId(punkId);
	}

	@Override
	public Optional<CyberwarePunk> findById(UUID id) {
		return cyberwarePunkPersistencePort.findById(id);
	}

	@Override
	public List<CyberwarePunk> listCyberwarePunks() {
		return cyberwarePunkPersistencePort.list();
	}

	@Override
	public CyberwarePunk updateCyberwarePunk(CyberwarePunk toSave) {
		return cyberwarePunkPersistencePort.update(toSave);
	}
}
