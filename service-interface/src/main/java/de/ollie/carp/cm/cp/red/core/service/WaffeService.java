package de.ollie.carp.cm.cp.red.core.service;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
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
public interface WaffeService {
	Waffe createWaffe(Fertigkeit fertigkeit, String name, String schaden);

	void deleteWaffe(UUID id);

	Optional<Waffe> findById(UUID id);

	List<Waffe> listWaffes();

	Waffe updateWaffe(Waffe toSave);
}
