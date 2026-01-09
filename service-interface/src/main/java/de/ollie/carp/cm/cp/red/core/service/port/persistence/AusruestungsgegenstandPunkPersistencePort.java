package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.cm.cp.red.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import jakarta.inject.Named;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Named
public interface AusruestungsgegenstandPunkPersistencePort {
	AusruestungsgegenstandPunk create(Ausruestungsgegenstand ausruestungsgegenstand, Punk punk);

	void deleteById(UUID id);

	List<AusruestungsgegenstandPunk> findAllByPunkId(UUID punkId);

	Optional<AusruestungsgegenstandPunk> findById(UUID id);

	List<AusruestungsgegenstandPunk> list();

	AusruestungsgegenstandPunk update(AusruestungsgegenstandPunk toSave);
}
