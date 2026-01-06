package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
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
public interface FertigkeitService {
	Fertigkeit createFertigkeit(Eigenschaft eigenschaft, String name, boolean rollenfertigkeit);

	void deleteFertigkeit(UUID id);

	Optional<Fertigkeit> findById(UUID id);

	List<Fertigkeit> listFertigkeits();

	Fertigkeit updateFertigkeit(Fertigkeit toSave);
}
