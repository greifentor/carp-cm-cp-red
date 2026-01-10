package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
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
public interface CyberwarePunkPersistencePort {
	CyberwarePunk create(Cyberware cyberware, Punk punk);

	void deleteById(UUID id);

	List<CyberwarePunk> findAllByPunk(Punk punk);

	Optional<CyberwarePunk> findById(UUID id);

	List<CyberwarePunk> list();

	CyberwarePunk update(CyberwarePunk toSave);
}
