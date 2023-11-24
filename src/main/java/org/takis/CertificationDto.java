package org.takis;

import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Builder;
import lombok.Data;

import java.time.LocalDate;

@Data
@Builder
public class CertificationDto {
    private String certificationName;
    private String organization;
    @JsonFormat(pattern = "dd-MM-YYYY")
    private LocalDate certificationDate;
}
