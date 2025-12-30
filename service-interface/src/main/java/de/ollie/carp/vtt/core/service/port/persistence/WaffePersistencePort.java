package de.ollie.carp.vtt.core.service.port.persistence;

import de.ollie.carp.vtt.core.service.model.Fertigkeit;
import de.ollie.carp.vtt.core.service.model.Waffe;
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
public interface WaffePersistencePort {
	Waffe create(Fertigkeit fertigkeit, String name, int schaden);

	void deleteById(UUID id);

	Optional<Waffe> findById(UUID id);

	List<Waffe> list();

	Waffe update(Waffe toSave);
}
