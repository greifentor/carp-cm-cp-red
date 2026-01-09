package de.ollie.carp.cm.cp.red.core.service.port.persistence;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import jakarta.inject.Named;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;

@Named
public interface EigenschaftPunkPersistencePort {
	EigenschaftPunk create(Eigenschaft eigenschaft, Punk punk, int wert);

	void deleteById(UUID id);

	Map<Eigenschaft, EigenschaftPunk> findAllByPunkId(UUID punkId);

	Optional<EigenschaftPunk> findById(UUID id);

	List<EigenschaftPunk> list();

	EigenschaftPunk update(EigenschaftPunk toSave);
}
