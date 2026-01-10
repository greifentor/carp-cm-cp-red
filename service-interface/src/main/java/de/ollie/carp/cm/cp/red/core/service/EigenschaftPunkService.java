package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;

public interface EigenschaftPunkService {
	EigenschaftPunk createEigenschaftPunk(Eigenschaft eigenschaft, Punk punk, int wert);

	void deleteEigenschaftPunk(UUID id);

	Map<Eigenschaft, EigenschaftPunk> findAllByPunk(Punk punk);

	Optional<EigenschaftPunk> findById(UUID id);

	List<EigenschaftPunk> listEigenschaftPunks();

	EigenschaftPunk updateEigenschaftPunk(EigenschaftPunk toSave);
}
