package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
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
public interface PanzerungService {
	Panzerung createPanzerung(boolean koerperpanzerung, String name, int sw);

	void deletePanzerung(UUID id);

	Optional<Panzerung> findById(UUID id);

	List<Panzerung> listPanzerungs();

	Panzerung updatePanzerung(Panzerung toSave);
}
