package cz.upce.nnpia_cv4.entity;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

@Entity
@Getter @Setter
public class Court {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    @Enumerated(EnumType.STRING)
    private CourtTypeEnum type;

    private Boolean active;

    @OneToMany(mappedBy = "court")
    private Set<TrainingUnit> trainingUnits;
}
