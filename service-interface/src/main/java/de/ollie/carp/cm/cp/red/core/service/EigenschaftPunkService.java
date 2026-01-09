package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;

public interface EigenschaftPunkService {
	EigenschaftPunk createEigenschaftPunk(Eigenschaft eigenschaft, Punk punk, int wert);

	void deleteEigenschaftPunk(UUID id);

	Optional<EigenschaftPunk> findById(UUID id);

	Map<Eigenschaft, EigenschaftPunk> findAllByPunkId(UUID punkId);

	List<EigenschaftPunk> listEigenschaftPunks();

	EigenschaftPunk updateEigenschaftPunk(EigenschaftPunk toSave);
}
