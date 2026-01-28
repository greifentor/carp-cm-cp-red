package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import jakarta.inject.Named;
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
@Named
public interface PunkPersistencePort {
	Punk create(
		String feinde,
		String freunde,
		String hintergrund,
		String liebschaften,
		String motivation,
		String name,
		Panzerung panzerungKoerper,
		Panzerung panzerungKopf,
		String persoenlichkeit,
		int euroBar,
		int euroKonto,
		int lpOffen,
		String ziele
	);

	void deleteById(UUID id);

	Optional<Punk> findById(UUID id);

	List<Punk> list();

	Punk update(Punk toSave);
}
