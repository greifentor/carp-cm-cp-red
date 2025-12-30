package de.ollie.carp.vtt.persistence.jpa.mapper;

import de.ollie.carp.vtt.core.service.model.AusruestungsgegenstandPunk;
import de.ollie.carp.vtt.persistence.jpa.dbo.AusruestungsgegenstandPunkDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface AusruestungsgegenstandPunkDboMapper {
	AusruestungsgegenstandPunk toModel(AusruestungsgegenstandPunkDbo dbo);
	AusruestungsgegenstandPunkDbo toDbo(AusruestungsgegenstandPunk model);
}
