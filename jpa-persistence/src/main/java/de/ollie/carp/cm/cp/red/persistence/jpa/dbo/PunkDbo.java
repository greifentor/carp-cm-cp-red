package de.ollie.carp.cm.cp.red.persistence.jpa.dbo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
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
@Entity(name = "PunkDbo")
@Table(name = "PUNK")
public class PunkDbo {

	@Id
	@Column(name = "ID", nullable = false)
	private UUID id;

	@Column(name = "NAME", nullable = false)
	private String name;

	@JoinColumn(name = "PANZERUNG_KOERPER", referencedColumnName = "ID", nullable = true)
	@ManyToOne(fetch = FetchType.EAGER)
	private PanzerungDbo panzerungKoerper;

	@JoinColumn(name = "PANZERUNG_KOPF", referencedColumnName = "ID", nullable = true)
	@ManyToOne(fetch = FetchType.EAGER)
	private PanzerungDbo panzerungKopf;
}
