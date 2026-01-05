package de.ollie.carp.cm.cp.red.persistence.jpa.mapper;

import de.ollie.carp.cm.cp.red.core.service.model.Eigenschaft;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.EigenschaftDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface EigenschaftDboMapper {
	Eigenschaft toModel(EigenschaftDbo dbo);
	EigenschaftDbo toDbo(Eigenschaft model);
}
