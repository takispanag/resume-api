package org.takis;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Education {
    private String institution;
    private String location;
    private String degree;
    private String fieldOfStudy;
    private String grade;
    private String registrationDate;
    private String graduationDate;
}


