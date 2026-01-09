package de.ollie.carp.cm.cp.red.persistence.jpa.repository;

import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.CyberwarePunkDbo;
import de.ollie.carp.cm.cp.red.persistence.jpa.dbo.PunkDbo;
import java.util.List;
import java.util.UUID;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface CyberwarePunkDboRepository extends JpaRepository<CyberwarePunkDbo, UUID> {
	List<CyberwarePunkDbo> findAllByPunk(PunkDbo punk);

	@Query("SELECT dbo FROM CyberwarePunkDbo dbo")
	List<CyberwarePunkDbo> findAllOrdered();
}
