package org.takis;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpokenLanguage {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String languageName;

    @Enumerated(EnumType.STRING)
    private SpokenLanguageProficiency proficiency;

    @ManyToOne
    @JoinColumn(name = "resumeId")
    private Resume resume;
}


