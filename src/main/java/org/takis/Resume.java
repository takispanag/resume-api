package org.takis;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Resume {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne(mappedBy = "resume", cascade = CascadeType.ALL)
    private ContactDetails contactDetails;

    @OneToOne(mappedBy = "resume", cascade = CascadeType.ALL)
    private Education education;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    private List<Role> roles;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    private List<Project> projects;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    private List<SpokenLanguage> spokenLanguages;

    @OneToMany(mappedBy = "resume", cascade = CascadeType.ALL)
    private List<Certification> certifications;
}
