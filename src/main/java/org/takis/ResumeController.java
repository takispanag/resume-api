package org.takis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/resume")
public class ResumeController {
    private final ResumeService resumeService;

    @GetMapping
    public ResumeDto getResume() {
        return resumeService.getResume();
    }

    @GetMapping("/contactDetails")
    public ContactDetailsDto getContactDetails() {
        return resumeService.getContactDetails();
    }

    @GetMapping("/education")
    public EducationDto getEducation() {
        return resumeService.getEducation();
    }

    @GetMapping("/roles")
    public List<RoleDto> getRoles() {
        return resumeService.getRoles();
    }

    @GetMapping("/projects")
    public List<ProjectDto> getProjects() {
        return resumeService.getProjects();
    }

    @GetMapping("/spokenLanguages")
    public List<SpokenLanguageDto> getSpokenLanguages() {
        return resumeService.getSpokenLanguages();
    }

    @GetMapping("/certifications")
    public List<CertificationDto> getCertifications() {
        return resumeService.getCertifications();
    }
}

