package de.ollie.carp.cm.cp.red.core.service.model;

import java.util.UUID;
import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Accessors(chain = true)
@Data
@Generated
public class Punk {

	private UUID id;
	private String feinde;
	private String freunde;
	private String hintergrund;
	private String liebschaften;
	private String motivation;
	private String name;
	private Panzerung panzerungKoerper;
	private Panzerung panzerungKopf;
	private String persoenlichkeit;
	private String ziele;
}
