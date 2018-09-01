package be.planty.models.prototyping;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Map;

import static java.util.Collections.unmodifiableMap;

public class ActionRequest extends be.planty.models.assistant.ActionRequest {

    public final Map<String, String> parameters;

    @JsonCreator
    public ActionRequest(@JsonProperty("action") String action,
                         @JsonProperty("parameters") Map<String, String> parameters) {
        super(action);
        this.parameters = unmodifiableMap(parameters);
    }
}
