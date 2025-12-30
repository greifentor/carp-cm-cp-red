package de.ollie.carp.vtt.persistence.jpa.mapper;

import de.ollie.carp.vtt.core.service.model.WaffePunk;
import de.ollie.carp.vtt.persistence.jpa.dbo.WaffePunkDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface WaffePunkDboMapper {
	WaffePunk toModel(WaffePunkDbo dbo);
	WaffePunkDbo toDbo(WaffePunk model);
}
