package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
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
public interface AusruestungsgegenstandPersistencePort {
	Ausruestungsgegenstand create(String beschreibung, String name);

	void deleteById(UUID id);

	Optional<Ausruestungsgegenstand> findById(UUID id);

	List<Ausruestungsgegenstand> list();

	Ausruestungsgegenstand update(Ausruestungsgegenstand toSave);
}
