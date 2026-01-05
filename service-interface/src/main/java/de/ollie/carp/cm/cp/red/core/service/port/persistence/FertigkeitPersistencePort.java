package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
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
public interface FertigkeitPersistencePort {
	Fertigkeit create(Eigenschaft eigenschaft, String name, boolean rollenfertigkeit);

	void deleteById(UUID id);

	Optional<Fertigkeit> findById(UUID id);

	List<Fertigkeit> list();

	Fertigkeit update(Fertigkeit toSave);
}
