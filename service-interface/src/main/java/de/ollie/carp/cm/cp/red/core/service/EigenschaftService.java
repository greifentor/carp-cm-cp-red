package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
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
public interface EigenschaftService {
	Eigenschaft createEigenschaft(String name);

	void deleteEigenschaft(UUID id);

	Optional<Eigenschaft> findById(UUID id);

	List<Eigenschaft> listEigenschafts();

	Eigenschaft updateEigenschaft(Eigenschaft toSave);
}
