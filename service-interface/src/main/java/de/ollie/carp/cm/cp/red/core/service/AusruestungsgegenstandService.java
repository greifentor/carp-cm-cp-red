package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Ausruestungsgegenstand;
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
public interface AusruestungsgegenstandService {
	Ausruestungsgegenstand createAusruestungsgegenstand(String name);

	void deleteAusruestungsgegenstand(UUID id);

	Optional<Ausruestungsgegenstand> findById(UUID id);

	List<Ausruestungsgegenstand> listAusruestungsgegenstands();

	Ausruestungsgegenstand updateAusruestungsgegenstand(Ausruestungsgegenstand toSave);
}
