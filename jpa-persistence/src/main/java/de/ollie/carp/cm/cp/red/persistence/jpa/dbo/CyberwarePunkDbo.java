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
@Entity(name = "CyberwarePunkDbo")
@Table(name = "CYBERWARE_PUNK")
public class CyberwarePunkDbo {

	@Id
	@Column(name = "ID", nullable = false)
	private UUID id;

	@JoinColumn(name = "CYBERWARE", referencedColumnName = "ID", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	private CyberwareDbo cyberware;

	@JoinColumn(name = "PUNK", referencedColumnName = "ID", nullable = false)
	@ManyToOne(fetch = FetchType.EAGER)
	private PunkDbo punk;
}
