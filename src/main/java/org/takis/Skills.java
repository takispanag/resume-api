package org.takis;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Skills {
    @JsonProperty("programmingLanguages")
    private String[] languages;

    @JsonProperty("frameworks")
    private String[] frameworks;

    @JsonProperty("databases")
    private String[] databases;

    @JsonProperty("tools")
    private String[] tools;

    @JsonProperty("platforms")
    private String[] platforms;
}
