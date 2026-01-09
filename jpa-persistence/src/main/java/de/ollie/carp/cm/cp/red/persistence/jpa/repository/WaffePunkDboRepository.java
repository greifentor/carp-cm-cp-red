package de.ollie.carp.cm.cp.red.persistence.jpa.repository;

import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.WaffePunkDbo;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface WaffePunkDboRepository extends JpaRepository<WaffePunkDbo, UUID> {
	List<WaffePunkDbo> findAllByPunk(PunkDbo punk);

	@Query("SELECT dbo FROM WaffePunkDbo dbo")
	List<WaffePunkDbo> findAllOrdered();
}
