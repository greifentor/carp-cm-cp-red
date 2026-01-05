package de.ollie.carp.cm.cp.red.persistence.jpa.mapper;

import de.ollie.carp.cm.cp.red.core.service.model.FertigkeitPunk;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.FertigkeitPunkDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface FertigkeitPunkDboMapper {
	FertigkeitPunk toModel(FertigkeitPunkDbo dbo);
	FertigkeitPunkDbo toDbo(FertigkeitPunk model);
}
