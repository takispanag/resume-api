package org.takis;

import jakarta.persistence.*;
import lombok.*;

import java.util.List;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Project {
    private String name;
    private String description;
    private List<String> technologyStack;
    private String link;
}

