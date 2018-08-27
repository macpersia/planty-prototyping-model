package be.planty.models.prototyping;

import com.fasterxml.jackson.annotation.JsonCreator;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import static java.util.Collections.unmodifiableMap;

public class ActionRequest {

    public final String action;
    public final Map<String, String> parameters;

    @JsonCreator
    public ActionRequest(String action, Map<String, String> parameters) {
        this.action = action;
        this.parameters = unmodifiableMap(parameters);
    }
}
