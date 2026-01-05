package de.ollie.carp.cm.cp.red.persistence.jpa.mapper;

import de.ollie.carp.cm.cp.red.core.service.model.RollePunk;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.RollePunkDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface RollePunkDboMapper {
	RollePunk toModel(RollePunkDbo dbo);
	RollePunkDbo toDbo(RollePunk model);
}
