package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface CyberwarePunkService {
	CyberwarePunk createCyberwarePunk(Cyberware cyberware, Punk punk);

	void deleteCyberwarePunk(UUID id);

	List<CyberwarePunk> findAllByPunkId(UUID id);

	Optional<CyberwarePunk> findById(UUID id);

	List<CyberwarePunk> listCyberwarePunks();

	CyberwarePunk updateCyberwarePunk(CyberwarePunk toSave);
}
