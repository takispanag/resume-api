package org.takis;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Role {
    private String title;
    private String level;
    private String company;
    private String business;
    private String location;
    private String startDate;
    private String endDate;
    private List<String> responsibilities;
    private List<String> technologyStack;
}

