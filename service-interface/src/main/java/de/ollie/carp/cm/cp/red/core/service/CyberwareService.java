package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
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
public interface CyberwareService {
	Cyberware createCyberware(String beschreibung, String name);

	void deleteCyberware(UUID id);

	Optional<Cyberware> findById(UUID id);

	List<Cyberware> listCyberwares();

	Cyberware updateCyberware(Cyberware toSave);
}
