package de.ollie.carp.vtt.persistence.jpa.mapper;

import de.ollie.carp.vtt.core.service.model.Waffe;
import de.ollie.carp.vtt.persistence.jpa.dbo.WaffeDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface WaffeDboMapper {
	Waffe toModel(WaffeDbo dbo);
	WaffeDbo toDbo(Waffe model);
}
