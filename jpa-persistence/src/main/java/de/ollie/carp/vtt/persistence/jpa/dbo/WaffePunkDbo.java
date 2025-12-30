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
@Entity(name = "WaffePunkDbo")
@Table(name = "WAFFE_PUNK")
public class WaffePunkDbo {


	@Id
	@Column(name = "ID", nullable = false)
	private UUID id;

	@JoinColumn(name = "PUNK", referencedColumnName = "ID", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	private PunkDbo punk;

	@JoinColumn(name = "WAFFE", referencedColumnName = "ID", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	private WaffeDbo waffe;

}
