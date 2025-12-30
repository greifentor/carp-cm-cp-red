package de.ollie.carp.vtt.core.service.port.persistence;

import de.ollie.carp.vtt.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.vtt.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.vtt.core.service.model.Punk;
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
public interface AusruestungsgegenstandPunkPersistencePort {
	AusruestungsgegenstandPunk create(Ausruestungsgegenstand ausruestungsgegenstand, Punk punk);

	void deleteById(UUID id);

	Optional<AusruestungsgegenstandPunk> findById(UUID id);

	List<AusruestungsgegenstandPunk> list();

	AusruestungsgegenstandPunk update(AusruestungsgegenstandPunk toSave);
}
