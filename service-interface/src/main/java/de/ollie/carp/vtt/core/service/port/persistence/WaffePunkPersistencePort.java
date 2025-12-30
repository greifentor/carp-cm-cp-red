package de.ollie.carp.vtt.core.service.port.persistence;

import de.ollie.carp.vtt.core.service.model.Punk;
import de.ollie.carp.vtt.core.service.model.Waffe;
import de.ollie.carp.vtt.core.service.model.WaffePunk;
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

	Optional<WaffePunk> findById(UUID id);

	List<WaffePunk> list();

	WaffePunk update(WaffePunk toSave);
}
