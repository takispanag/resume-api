package org.takis;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class ContactDetails {
    private String linkedIn;
    private String email;
    private String github;
    private String phoneNumber;
}

