package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
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
public interface WaffePunkPersistencePort {
	WaffePunk create(Punk punk, Waffe waffe);

	void deleteById(UUID id);

	List<WaffePunk> findAllByPunk(Punk punk);

	Optional<WaffePunk> findById(UUID id);

	List<WaffePunk> list();

	WaffePunk update(WaffePunk toSave);
}
