package org.takis;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String companyName;

    private String position;

    private String location;

    @Enumerated(EnumType.STRING)
    private WorkingModel workingModel;

    private String employmentType;

    private List<String> achievements;

    private List<String> technologyStack;

    private LocalDate startDate;

    private LocalDate endDate;

    @ManyToOne
    @JoinColumn(name = "resumeId")
    private Resume resume;
}

