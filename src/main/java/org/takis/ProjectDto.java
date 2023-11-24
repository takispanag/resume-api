package org.takis;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProjectDto {
    private String projectName;
    private String description;
}
