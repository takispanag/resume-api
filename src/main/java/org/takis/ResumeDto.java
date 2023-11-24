package org.takis;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResumeDto {
    private ContactDetailsDto contactDetails;
    private List<ProjectDto> projects;
    private List<RoleDto> roles;
    private List<SpokenLanguageDto> spokenLanguages;
    private List<CertificationDto> certifications;
    private EducationDto education;
}
