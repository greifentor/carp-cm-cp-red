package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
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
public interface WaffePunkService {
	WaffePunk createWaffePunk(Punk punk, Waffe waffe);

	void deleteWaffePunk(UUID id);

	List<WaffePunk> findAllByPunk(UUID punkId);

	Optional<WaffePunk> findById(UUID id);

	List<WaffePunk> listWaffePunks();

	WaffePunk updateWaffePunk(WaffePunk toSave);
}
