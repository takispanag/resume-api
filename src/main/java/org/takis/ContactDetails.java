package org.takis;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetails {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String fullName;

    private String linkedIn;

    private String email;

    private String github;

    private String mobile;

    @ManyToOne
    @JoinColumn(name = "resumeId")
    private Resume resume;
}

