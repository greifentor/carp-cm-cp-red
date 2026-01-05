package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
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
	Punk create(String name, Panzerung panzerungKoerper, Panzerung panzerungKopf, Rolle rolle);

	void deleteById(UUID id);

	Optional<Punk> findById(UUID id);

	List<Punk> list();

	Punk update(Punk toSave);
}
