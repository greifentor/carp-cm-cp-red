package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import jakarta.inject.Named;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Named
public interface FertigkeitPunkPersistencePort {
	FertigkeitPunk create(Fertigkeit fertigkeit, Punk punk, int wert);

	void deleteById(UUID id);

	List<FertigkeitPunk> findAllByPunkId(UUID punkId);

	Optional<FertigkeitPunk> findById(UUID id);

	List<FertigkeitPunk> list();

	FertigkeitPunk update(FertigkeitPunk toSave);
}
