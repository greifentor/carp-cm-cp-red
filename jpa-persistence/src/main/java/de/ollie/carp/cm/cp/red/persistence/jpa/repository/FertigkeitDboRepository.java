package de.ollie.carp.cm.cp.red.persistence.jpa.repository;

import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.FertigkeitDbo;
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
public interface FertigkeitDboRepository extends JpaRepository<FertigkeitDbo, UUID> {
	@Query("SELECT dbo FROM FertigkeitDbo dbo ORDER BY dbo.name")
	List<FertigkeitDbo> findAllOrdered();
}
