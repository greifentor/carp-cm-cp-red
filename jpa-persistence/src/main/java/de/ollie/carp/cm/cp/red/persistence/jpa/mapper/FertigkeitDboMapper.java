package de.ollie.carp.cm.cp.red.persistence.jpa.mapper;

import de.ollie.carp.cm.cp.red.core.service.model.Fertigkeit;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.FertigkeitDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface FertigkeitDboMapper {
	Fertigkeit toModel(FertigkeitDbo dbo);
	FertigkeitDbo toDbo(Fertigkeit model);
}
