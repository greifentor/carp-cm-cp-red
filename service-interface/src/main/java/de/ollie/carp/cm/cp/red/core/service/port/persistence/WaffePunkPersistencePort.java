package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.model.WaffePunk;
import jakarta.inject.Named;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;

@Named
public interface WaffePunkPersistencePort {
	WaffePunk create(Punk punk, Waffe waffe);

	void deleteById(UUID id);

	List<WaffePunk> findAllByPunkId(UUID punkId);

	Optional<WaffePunk> findById(UUID id);

	List<WaffePunk> list();

	WaffePunk update(WaffePunk toSave);
}
