package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
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
public interface RolleService {
	Rolle createRolle(String name, Fertigkeit rollenfertigkeit);

	void deleteRolle(UUID id);

	Optional<Rolle> findById(UUID id);

	List<Rolle> listRolles();

	Rolle updateRolle(Rolle toSave);
}
