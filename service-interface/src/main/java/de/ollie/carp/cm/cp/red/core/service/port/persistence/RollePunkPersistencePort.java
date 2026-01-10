package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
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
public interface RollePunkPersistencePort {
	RollePunk create(Punk punk, Rolle rolle);

	void deleteById(UUID id);

	List<RollePunk> findAllByPunk(Punk punk);

	Optional<RollePunk> findById(UUID id);

	List<RollePunk> list();

	RollePunk update(RollePunk toSave);
}
