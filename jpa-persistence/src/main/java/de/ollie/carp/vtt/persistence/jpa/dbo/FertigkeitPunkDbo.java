package de.ollie.carp.vtt.persistence.jpa.dbo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Generated;
import lombok.experimental.Accessors;

import java.util.UUID;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Accessors(chain = true)
@Data
@Generated
@Entity(name = "FertigkeitPunkDbo")
@Table(name = "FERTIGKEIT_PUNK")
public class FertigkeitPunkDbo {


	@Id
	@Column(name = "ID", nullable = false)
	private UUID id;

	@JoinColumn(name = "FERTIGKEIT", referencedColumnName = "ID", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	private FertigkeitDbo fertigkeit;

	@JoinColumn(name = "PUNK", referencedColumnName = "ID", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	private PunkDbo punk;

	@Column(name = "WERT", nullable = false)
	private int wert;

}
