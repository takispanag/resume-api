package org.takis;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class SpokenLanguageDto {
    private String languageName;
    private String proficiency;
}
