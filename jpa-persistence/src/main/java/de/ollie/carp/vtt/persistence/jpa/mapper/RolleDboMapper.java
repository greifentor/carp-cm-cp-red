package de.ollie.carp.vtt.persistence.jpa.mapper;

import de.ollie.carp.vtt.core.service.model.Rolle;
import de.ollie.carp.vtt.persistence.jpa.dbo.RolleDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface RolleDboMapper {
	Rolle toModel(RolleDbo dbo);
	RolleDbo toDbo(Rolle model);
}
