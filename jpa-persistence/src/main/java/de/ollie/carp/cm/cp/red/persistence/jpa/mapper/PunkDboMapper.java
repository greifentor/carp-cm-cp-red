package de.ollie.carp.cm.cp.red.persistence.jpa.mapper;

import de.ollie.carp.cm.cp.red.core.service.model.Punk;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface PunkDboMapper {
	Punk toModel(PunkDbo dbo);
	PunkDbo toDbo(Punk model);
}
