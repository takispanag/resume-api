package org.takis;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class SpokenLanguage {
    private String language;

    @Enumerated(EnumType.STRING)
    private SpokenLanguageProficiency proficiency;
}


