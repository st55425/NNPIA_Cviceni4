package cz.upce.nnpia_cv4.repository;

import cz.upce.nnpia_cv4.entity.Court;
import cz.upce.nnpia_cv4.entity.TrainingUnit;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.LocalDateTime;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class CourtRepositoryTest {

    @Autowired
    CourtRepository repository;

    @Test
    void findByUsernameTest(){
        Court court = repository.findByName("Kurt 1");
        assertEquals(court.getName(), "Kurt 1");
        assertTrue(court.getTrainingUnits().size() > 0);
    }

}