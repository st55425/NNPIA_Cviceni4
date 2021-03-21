package cz.upce.nnpia_cv4.repository;

import cz.upce.nnpia_cv4.entity.Court;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourtRepository extends JpaRepository<Court, Long> {


    @EntityGraph(attributePaths = "trainingUnits")
    Court findByName(String name);
}
