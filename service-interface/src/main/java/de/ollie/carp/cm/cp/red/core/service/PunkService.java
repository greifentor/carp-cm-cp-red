package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
public interface PunkService {
	Punk createPunk(String name, Panzerung panzerungKoerper, Panzerung panzerungKopf, Rolle rolle);

	void deletePunk(UUID id);

	Optional<Punk> findById(UUID id);

	List<Punk> listPunks();

	Punk updatePunk(Punk toSave);
}
