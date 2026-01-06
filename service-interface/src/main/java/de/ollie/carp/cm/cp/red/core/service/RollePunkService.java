package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
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
public interface RollePunkService {
	RollePunk createRollePunk(Punk punk, Rolle rolle);

	void deleteRollePunk(UUID id);

	Optional<RollePunk> findById(UUID id);

	List<RollePunk> listRollePunks();

	RollePunk updateRollePunk(RollePunk toSave);
}
