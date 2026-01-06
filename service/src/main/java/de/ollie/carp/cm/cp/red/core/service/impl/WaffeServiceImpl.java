package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.WaffeService;
import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.core.service.model.Waffe;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.WaffePersistencePort;
import jakarta.inject.Named;
import java.util.List;
import java.util.Optional;
import java.util.UUID;
import lombok.Generated;
import lombok.RequiredArgsConstructor;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Generated
@Named
@RequiredArgsConstructor
class WaffeServiceImpl implements WaffeService {

	private final WaffePersistencePort waffePersistencePort;

	@Override
	public Waffe createWaffe(Fertigkeit fertigkeit, String name, String schaden) {
		return waffePersistencePort.create(fertigkeit, name, schaden);
	}

	@Override
	public void deleteWaffe(UUID id) {
		waffePersistencePort.deleteById(id);
	}

	@Override
	public Optional<Waffe> findById(UUID id) {
		return waffePersistencePort.findById(id);
	}

	@Override
	public List<Waffe> listWaffes() {
		return waffePersistencePort.list();
	}

	@Override
	public Waffe updateWaffe(Waffe toSave) {
		return waffePersistencePort.update(toSave);
	}
}
