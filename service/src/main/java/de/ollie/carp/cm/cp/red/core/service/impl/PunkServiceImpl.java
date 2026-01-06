package de.ollie.carp.cm.cp.red.core.service.impl;

import de.ollie.carp.cm.cp.red.core.service.PunkService;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Panzerung;
import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.core.service.model.Rolle;
import de.ollie.carp.cm.cp.red.core.service.port.persistence.PunkPersistencePort;
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
class PunkServiceImpl implements PunkService {

	private final PunkPersistencePort punkPersistencePort;

	@Override
	public Punk createPunk(String name, Panzerung panzerungKoerper, Panzerung panzerungKopf, Rolle rolle) {
		return punkPersistencePort.create(name, panzerungKoerper, panzerungKopf, rolle);
	}

	@Override
	public void deletePunk(UUID id) {
		punkPersistencePort.deleteById(id);
	}

	@Override
	public Optional<Punk> findById(UUID id) {
		return punkPersistencePort.findById(id);
	}

	@Override
	public List<Punk> listPunks() {
		return punkPersistencePort.list();
	}

	@Override
	public Punk updatePunk(Punk toSave) {
		return punkPersistencePort.update(toSave);
	}
}
