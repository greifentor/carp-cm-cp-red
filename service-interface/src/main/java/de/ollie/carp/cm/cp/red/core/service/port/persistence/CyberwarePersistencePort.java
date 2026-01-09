package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
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
public interface CyberwarePersistencePort {
	Cyberware create(String beschreibung, String name);

	void deleteById(UUID id);

	Optional<Cyberware> findById(UUID id);

	List<Cyberware> list();

	Cyberware update(Cyberware toSave);
}
