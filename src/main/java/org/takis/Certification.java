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
public class Certification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String certificationName;

    private String organization;

    private LocalDate certificationDate;

    @ManyToOne
    @JoinColumn(name = "resumeId")
    private Resume resume;
}


