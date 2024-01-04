package org.takis;

import lombok.AllArgsConstructor;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ResumeService {
    private final Resume resume; // Assuming you have a Resume class with appropriate data structure

    public ResumeService() {
        this.resume = ResumeLoader.getTakisResume();
    }
    public Resume getResume() {
        return resume;
    }
    public List<Role> getRoles() {
        // Replace with your actual logic to retrieve roles from takisResume
        return resume.getRoles();
    }

//    public Role getRoleById(String id) {
//        // Replace with your actual logic to retrieve a role by ID from takisResume
//        return resume.getRoleById(id);
//    }

    public ContactDetails getContactDetails() {
        // Replace with your actual logic to retrieve contact details from takisResume
        return resume.getContactDetails();
    }

    public List<Education> getEducation() {
        // Replace with your actual logic to retrieve education details from takisResume
        return resume.getEducation();
    }

    public List<Project> getProjects() {
        // Replace with your actual logic to retrieve projects from takisResume
        return resume.getProjects();
    }

    public List<SpokenLanguage> getSpokenLanguages() {
        // Replace with your actual logic to retrieve spoken languages from takisResume
        return resume.getSpokenLanguages();
    }

    public List<Certification> getCertifications() {
        // Replace with your actual logic to retrieve certifications from takisResume
        return resume.getCertifications();
    }

//    public Certification getCertificationById(String id) {
//        // Replace with your actual logic to retrieve a certification by ID from takisResume
//        return resume.getCertificationById(id);
//    }

    public Skills getSkills() {
        // Replace with your actual logic to retrieve skills from takisResume
        return resume.getSkills();
    }

//    public ContactDetailsDto getContactDetails() {
//        ContactDetails contactDetails = getResumeFromDb().getContactDetails();
//
//        return ContactDetailsDto.builder()
//                .fullName(contactDetails.getFullName())
//                .linkedIn(contactDetails.getLinkedIn())
//                .email(contactDetails.getEmail())
//                .github(contactDetails.getGithub())
//                .mobile(contactDetails.getMobile())
//                .build();
//    }
//
//    public EducationDto getEducation() {
//        Education education = getResumeFromDb().getEducation();
//
//        return EducationDto.builder()
//                .university(education.getUniversity())
//                .degree(education.getDegree())
//                .grade(education.getGrade())
//                .graduationDate(education.getGraduationDate())
//                .build();
//    }
//
//    public List<RoleDto> getRoles() {
//        return getResumeFromDb()
//                .getRoles()
//                .stream()
//                .map(this::mapRoleToDto)
//                .toList();
//    }
//
//    public List<ProjectDto> getProjects() {
//        return getResumeFromDb()
//                .getProjects()
//                .stream()
//                .map(this::mapProjectToDto)
//                .toList();
//    }
//
//    public List<SpokenLanguageDto> getSpokenLanguages() {
//        return getResumeFromDb()
//                .getSpokenLanguages()
//                .stream()
//                .map(this::mapSpokenLanguageToDto)
//                .toList();
//    }
//
//    public List<CertificationDto> getCertifications() {
//        return getResumeFromDb()
//                .getCertifications()
//                .stream()
//                .map(this::mapCertificationToDto)
//                .toList();
//    }
//
//    private ProjectDto mapProjectToDto(Project project) {
//        return ProjectDto.builder()
//                .projectName(project.getProjectName())
//                .description(project.getDescription())
//                .build();
//    }
//
//    @Cacheable("resume")
//    private Resume getResumeFromDb() {
//        return resumeRepository.findById(1L).orElse(new Resume());
//    }
//
//    private SpokenLanguageDto mapSpokenLanguageToDto(SpokenLanguage spokenLanguage) {
//        return SpokenLanguageDto.builder()
//                .languageName(spokenLanguage.getLanguageName())
//                .proficiency(spokenLanguage.getProficiency().getDisplayName())
//                .build();
//    }
//
//    private CertificationDto mapCertificationToDto(Certification certification) {
//        return CertificationDto.builder()
//                .certificationName(certification.getCertificationName())
//                .organization(certification.getOrganization())
//                .certificationDate(certification.getCertificationDate())
//                .build();
//    }
//
//    private RoleDto mapRoleToDto(Role role) {
//        return RoleDto.builder()
//                .companyName(role.getCompanyName())
//                .position(role.getPosition())
//                .location(role.getLocation())
//                .workingModel(role.getWorkingModel().getDisplayName())
//                .employmentType(role.getEmploymentType())
//                .startDate(role.getStartDate())
//                .endDate(role.getEndDate())
//                .achievements(role.getAchievements())
//                .technologyStack(role.getTechnologyStack())
//                .build();
//    }
}
