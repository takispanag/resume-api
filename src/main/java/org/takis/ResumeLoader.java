package org.takis;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ResumeLoader {
    private static final ObjectMapper objectMapper = new ObjectMapper();
    private static final Path resumeFilePath = Paths.get("resume.json");
    public static Resume getTakisResume() {
        try {
            return objectMapper.readValue(resumeFilePath.toFile(), Resume.class);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load resume data", e);
        }
    }
}

