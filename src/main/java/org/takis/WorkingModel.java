package org.takis;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
public enum WorkingModel {
    ONSITE("Onsite"),
    HYBRID("Hybrid"),
    REMOTE("Remote");

    private final String displayName;
}
