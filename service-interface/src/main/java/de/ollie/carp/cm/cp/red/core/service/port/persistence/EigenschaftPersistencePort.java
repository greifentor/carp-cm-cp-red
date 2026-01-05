package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
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
public interface EigenschaftPersistencePort {
	Eigenschaft create(String name);

	void deleteById(UUID id);

	Optional<Eigenschaft> findById(UUID id);

	List<Eigenschaft> list();

	Eigenschaft update(Eigenschaft toSave);
}
