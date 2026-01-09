package de.ollie.carp.cm.cp.red.persistence.jpa.mapper;

import de.ollie.carp.cm.cp.red.core.service.model.Cyberware;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.CyberwareDbo;
import org.mapstruct.Mapper;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Mapper(componentModel = "spring")
public interface CyberwareDboMapper {
	Cyberware toModel(CyberwareDbo dbo);
	CyberwareDbo toDbo(Cyberware model);
}
