package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftService;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.EigenschaftPersistencePort;
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
class EigenschaftServiceImpl implements EigenschaftService {

	private final EigenschaftPersistencePort eigenschaftPersistencePort;

	@Override
	public Eigenschaft createEigenschaft(String name) {
		return eigenschaftPersistencePort.create(name);
	}

	@Override
	public void deleteEigenschaft(UUID id) {
		eigenschaftPersistencePort.deleteById(id);
	}

	@Override
	public Optional<Eigenschaft> findById(UUID id) {
		return eigenschaftPersistencePort.findById(id);
	}

	@Override
	public List<Eigenschaft> listEigenschafts() {
		return eigenschaftPersistencePort.list();
	}

	@Override
	public Eigenschaft updateEigenschaft(Eigenschaft toSave) {
		return eigenschaftPersistencePort.update(toSave);
	}
}
