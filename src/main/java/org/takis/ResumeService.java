package org.takis;

import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor

// TODO maybe query your own database instead of getting the resume each time
public class ResumeService {
    private final ResumeRepository resumeRepository;

    public ResumeDto getResume() {
        return ResumeDto.builder()
                .contactDetails(getContactDetails())
                .education(getEducation())
                .roles(getRoles())
                .projects(getProjects())
                .spokenLanguages(getSpokenLanguages())
                .certifications(getCertifications())
                .build();
    }

    public ContactDetailsDto getContactDetails() {
        ContactDetails contactDetails = getResumeFromDb().getContactDetails();

        return ContactDetailsDto.builder()
                .fullName(contactDetails.getFullName())
                .linkedIn(contactDetails.getLinkedIn())
                .email(contactDetails.getEmail())
                .github(contactDetails.getGithub())
                .mobile(contactDetails.getMobile())
                .build();
    }

    public EducationDto getEducation() {
        Education education = getResumeFromDb().getEducation();

        return EducationDto.builder()
                .university(education.getUniversity())
                .degree(education.getDegree())
                .grade(education.getGrade())
                .graduationDate(education.getGraduationDate())
                .build();
    }

    public List<RoleDto> getRoles() {
        return getResumeFromDb()
                .getRoles()
                .stream()
                .map(this::mapRoleToDto)
                .toList();
    }

    public List<ProjectDto> getProjects() {
        return getResumeFromDb()
                .getProjects()
                .stream()
                .map(this::mapProjectToDto)
                .toList();
    }

    public List<SpokenLanguageDto> getSpokenLanguages() {
        return getResumeFromDb()
                .getSpokenLanguages()
                .stream()
                .map(this::mapSpokenLanguageToDto)
                .toList();
    }

    public List<CertificationDto> getCertifications() {
        return getResumeFromDb()
                .getCertifications()
                .stream()
                .map(this::mapCertificationToDto)
                .toList();
    }

    private ProjectDto mapProjectToDto(Project project) {
        return ProjectDto.builder()
                .projectName(project.getProjectName())
                .description(project.getDescription())
                .build();
    }

    @Cacheable("resume")
    private Resume getResumeFromDb() {
        return resumeRepository.findById(1L).orElse(new Resume());
    }

    private SpokenLanguageDto mapSpokenLanguageToDto(SpokenLanguage spokenLanguage) {
        return SpokenLanguageDto.builder()
                .languageName(spokenLanguage.getLanguageName())
                .proficiency(spokenLanguage.getProficiency().getDisplayName())
                .build();
    }

    private CertificationDto mapCertificationToDto(Certification certification) {
        return CertificationDto.builder()
                .certificationName(certification.getCertificationName())
                .organization(certification.getOrganization())
                .certificationDate(certification.getCertificationDate())
                .build();
    }

    private RoleDto mapRoleToDto(Role role) {
        return RoleDto.builder()
                .companyName(role.getCompanyName())
                .position(role.getPosition())
                .location(role.getLocation())
                .workingModel(role.getWorkingModel().getDisplayName())
                .employmentType(role.getEmploymentType())
                .startDate(role.getStartDate())
                .endDate(role.getEndDate())
                .achievements(role.getAchievements())
                .technologyStack(role.getTechnologyStack())
                .build();
    }
}
