package de.ollie.carp.vtt.persistence.jpa.mapper;

import de.ollie.carp.vtt.core.service.model.Panzerung;
import de.ollie.carp.vtt.persistence.jpa.dbo.PanzerungDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface PanzerungDboMapper {
	Panzerung toModel(PanzerungDbo dbo);
	PanzerungDbo toDbo(Panzerung model);
}
