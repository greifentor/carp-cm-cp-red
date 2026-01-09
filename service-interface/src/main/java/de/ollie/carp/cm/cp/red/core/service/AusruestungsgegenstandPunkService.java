package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;

public interface AusruestungsgegenstandPunkService {
	AusruestungsgegenstandPunk createAusruestungsgegenstandPunk(Ausruestungsgegenstand ausruestungsgegenstand, Punk punk);

	void deleteAusruestungsgegenstandPunk(UUID id);

	List<AusruestungsgegenstandPunk> findAllByPunkId(UUID punkId);

	Optional<AusruestungsgegenstandPunk> findById(UUID id);

	List<AusruestungsgegenstandPunk> listAusruestungsgegenstandPunks();

	AusruestungsgegenstandPunk updateAusruestungsgegenstandPunk(AusruestungsgegenstandPunk toSave);
}
