package de.ollie.carp.cm.cp.red.persistence.jpa.repository;

import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.AusruestungsgegenstandPunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * GENERATED CODE - DO NOT TOUCH
 *
 * Remove this comment to suspend class from generation process.
 */
@Repository
public interface AusruestungsgegenstandPunkDboRepository extends JpaRepository<AusruestungsgegenstandPunkDbo, UUID> {
	@Query("SELECT dbo FROM AusruestungsgegenstandPunkDbo dbo")
	List<AusruestungsgegenstandPunkDbo> findAllOrdered();

	List<AusruestungsgegenstandPunkDbo> findAllByPunk(PunkDbo punk);
}
