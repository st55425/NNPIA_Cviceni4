package cz.upce.nnpia_cv4.repository;

import cz.upce.nnpia_cv4.entity.Court;
import cz.upce.nnpia_cv4.entity.TrainingUnit;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;

public interface TrainingUnitRepository extends JpaRepository<TrainingUnit, Long> {

    List<TrainingUnit> findByCourtAndFromBetween(Court court, LocalDateTime from, LocalDateTime to);

    List<TrainingUnit> findByReservationNotNullAndCourt(Court court);
}
