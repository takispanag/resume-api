package org.takis;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/resume")
@RequiredArgsConstructor
public class ResumeController {
    private final ResumeService resumeService;

    @GetMapping
    public Resume getResume() {
        return resumeService.getResume();
    }

    @GetMapping("/roles")
    public List<Role> getRoles() {
        return resumeService.getRoles();
    }

//    @GetMapping("/roles/{id}")
//    public Role getRoleById(@PathVariable String id) {
//        return resumeService.getRoleById(id);
//    }

    @GetMapping("/contactDetails")
    public ContactDetails getContactDetails() {
        return resumeService.getContactDetails();
    }

    @GetMapping("/education")
    public List<Education> getEducation() {
        return resumeService.getEducation();
    }

    @GetMapping("/projects")
    public List<Project> getProjects() {
        return resumeService.getProjects();
    }

    @GetMapping("/spokenLanguages")
    public List<SpokenLanguage> getSpokenLanguages() {
        return resumeService.getSpokenLanguages();
    }

    @GetMapping("/certifications")
    public List<Certification> getCertifications() {
        return resumeService.getCertifications();
    }

//    @GetMapping("/certifications/{id}")
//    public Certification getCertificationById(@PathVariable String id) {
//        return resumeService.getCertificationById(id);
//    }

    @GetMapping("/skills")
    public Skills getSkills() {
        return resumeService.getSkills();
    }
}

