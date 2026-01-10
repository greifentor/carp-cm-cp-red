package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
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
	Punk createPunk(
		String feinde,
		String freunde,
		String hintergrund,
		String liebschaften,
		String motivation,
		String name,
		Panzerung panzerungKoerper,
		Panzerung panzerungKopf,
		String persoenlichkeit,
		String ziele
	);

	void deletePunk(UUID id);

	Optional<Punk> findById(UUID id);

	List<Punk> listPunks();

	Punk updatePunk(Punk toSave);
}
