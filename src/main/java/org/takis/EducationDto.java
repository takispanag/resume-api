package org.takis;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class EducationDto {
    private String university;
    private String degree;
    private Double grade;
    @JsonFormat(pattern = "dd-MM-YYYY")
    private LocalDate graduationDate;
}
