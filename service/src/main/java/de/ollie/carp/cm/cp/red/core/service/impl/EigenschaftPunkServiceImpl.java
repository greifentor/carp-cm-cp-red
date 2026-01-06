package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.EigenschaftPunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.core.service.model.EigenschaftPunk;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.EigenschaftPunkPersistencePort;
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
class EigenschaftPunkServiceImpl implements EigenschaftPunkService {

	private final EigenschaftPunkPersistencePort eigenschaftPunkPersistencePort;

	@Override
	public EigenschaftPunk createEigenschaftPunk(Eigenschaft eigenschaft, Punk punk, int wert) {
		return eigenschaftPunkPersistencePort.create(eigenschaft, punk, wert);
	}

	@Override
	public void deleteEigenschaftPunk(UUID id) {
		eigenschaftPunkPersistencePort.deleteById(id);
	}

	@Override
	public Optional<EigenschaftPunk> findById(UUID id) {
		return eigenschaftPunkPersistencePort.findById(id);
	}

	@Override
	public List<EigenschaftPunk> listEigenschaftPunks() {
		return eigenschaftPunkPersistencePort.list();
	}

	@Override
	public EigenschaftPunk updateEigenschaftPunk(EigenschaftPunk toSave) {
		return eigenschaftPunkPersistencePort.update(toSave);
	}
}
