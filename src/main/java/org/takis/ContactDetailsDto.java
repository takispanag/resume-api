package org.takis;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ContactDetailsDto {
    private String fullName;
    private String linkedIn;
    private String email;
    private String github;
    private String mobile;
}
