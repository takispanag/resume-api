package org.takis;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;
import java.util.List;

@Data
@Builder
public class RoleDto {
    private String companyName;
    private String position;
    private String location;
    private String workingModel;
    private String employmentType;
    private List<String> achievements;
    private List<String> technologyStack;
    @JsonFormat(pattern = "dd-MM-YYYY")
    private LocalDate startDate;
    @JsonFormat(pattern = "dd-MM-YYYY")
    private LocalDate endDate;
}
