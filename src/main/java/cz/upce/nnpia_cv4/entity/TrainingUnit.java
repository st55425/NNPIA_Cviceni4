package cz.upce.nnpia_cv4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Getter @Setter
public class TrainingUnit {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "time_from")
    private LocalDateTime from;

    @Column(name = "time_to")
    private LocalDateTime to;

    @ManyToOne
    private Court court;

    @ManyToOne
    private Reservation reservation;

}
