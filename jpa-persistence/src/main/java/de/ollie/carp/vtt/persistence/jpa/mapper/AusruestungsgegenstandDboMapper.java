package de.ollie.carp.vtt.persistence.jpa.mapper;

import de.ollie.carp.vtt.core.service.model.Ausruestungsgegenstand;
import de.ollie.carp.vtt.persistence.jpa.dbo.AusruestungsgegenstandDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface AusruestungsgegenstandDboMapper {
	Ausruestungsgegenstand toModel(AusruestungsgegenstandDbo dbo);
	AusruestungsgegenstandDbo toDbo(Ausruestungsgegenstand model);
}
