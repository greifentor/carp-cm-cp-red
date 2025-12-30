package de.ollie.carp.vtt.core.service.port.persistence;

import de.ollie.carp.vtt.core.service.model.Eigenschaft;
import de.ollie.carp.vtt.core.service.model.EigenschaftPunk;
import de.ollie.carp.vtt.core.service.model.Punk;
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
public interface EigenschaftPunkPersistencePort {
	EigenschaftPunk create(Eigenschaft eigenschaft, Punk punk);

	void deleteById(UUID id);

	Optional<EigenschaftPunk> findById(UUID id);

	List<EigenschaftPunk> list();

	EigenschaftPunk update(EigenschaftPunk toSave);
}
