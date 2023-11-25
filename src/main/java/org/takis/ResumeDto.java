package org.takis;

import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
public class ResumeDto {
    private ContactDetailsDto contactDetails;
    private EducationDto education;
    private List<RoleDto> roles;
    private List<ProjectDto> projects;
    private List<SpokenLanguageDto> spokenLanguages;
    private List<CertificationDto> certifications;
}
