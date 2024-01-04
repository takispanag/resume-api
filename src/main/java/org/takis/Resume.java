package org.takis;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Resume {
    private String name;
    private List<Role> roles;
    private ContactDetails contactDetails;
    private List<Education> education;
    private Skills skills;
    private List<Project> projects;
    private List<SpokenLanguage> spokenLanguages;
    private List<Certification> certifications;
}
