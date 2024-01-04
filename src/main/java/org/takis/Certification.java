package org.takis;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Certification {
    private String name;
    private String provider;
    private String link;
    private LocalDate date;
}


