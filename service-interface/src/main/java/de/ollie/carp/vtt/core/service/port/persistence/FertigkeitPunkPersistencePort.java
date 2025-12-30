package de.ollie.carp.vtt.core.service.port.persistence;

import de.ollie.carp.vtt.core.service.model.Fertigkeit;
import de.ollie.carp.vtt.core.service.model.FertigkeitPunk;
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
public interface FertigkeitPunkPersistencePort {
	FertigkeitPunk create(Fertigkeit fertigkeit, Punk punk, int wert);

	void deleteById(UUID id);

	Optional<FertigkeitPunk> findById(UUID id);

	List<FertigkeitPunk> list();

	FertigkeitPunk update(FertigkeitPunk toSave);
}
