package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
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
public interface FertigkeitPunkService {
	FertigkeitPunk createFertigkeitPunk(Fertigkeit fertigkeit, Punk punk, int wert);

	void deleteFertigkeitPunk(UUID id);

	Optional<FertigkeitPunk> findById(UUID id);

	List<FertigkeitPunk> listFertigkeitPunks();

	FertigkeitPunk updateFertigkeitPunk(FertigkeitPunk toSave);
}
