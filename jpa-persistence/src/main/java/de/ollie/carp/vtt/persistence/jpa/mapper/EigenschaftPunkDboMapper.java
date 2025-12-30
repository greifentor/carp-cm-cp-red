package de.ollie.carp.vtt.persistence.jpa.mapper;

import de.ollie.carp.vtt.core.service.model.EigenschaftPunk;
import de.ollie.carp.vtt.persistence.jpa.dbo.EigenschaftPunkDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface EigenschaftPunkDboMapper {
	EigenschaftPunk toModel(EigenschaftPunkDbo dbo);
	EigenschaftPunkDbo toDbo(EigenschaftPunk model);
}
