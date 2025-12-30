package de.ollie.carp.vtt.core.service.port.persistence;

import de.ollie.carp.vtt.core.service.model.Panzerung;
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
public interface PanzerungPersistencePort {
	Panzerung create(boolean koerperpanzerung, String name, int sw);

	void deleteById(UUID id);

	Optional<Panzerung> findById(UUID id);

	List<Panzerung> list();

	Panzerung update(Panzerung toSave);
}
