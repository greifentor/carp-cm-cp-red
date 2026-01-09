package de.ollie.carp.cm.cp.red.persistence.jpa.mapper;

import de.ollie.carp.cm.cp.red.core.service.model.CyberwarePunk;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.CyberwarePunkDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface CyberwarePunkDboMapper {
	CyberwarePunk toModel(CyberwarePunkDbo dbo);
	CyberwarePunkDbo toDbo(CyberwarePunk model);
}
