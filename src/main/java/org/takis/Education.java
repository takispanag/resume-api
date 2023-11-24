package org.takis;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Education {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String university;

    private String degree;

    private Double grade;

    private LocalDate graduationDate;

    @ManyToOne
    @JoinColumn(name = "resumeId")
    private Resume resume;
}


