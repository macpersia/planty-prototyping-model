package be.planty.models.prototyping;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionResponse extends be.planty.models.assistant.ActionResponse {

    @JsonCreator
    public ActionResponse(@JsonProperty("statusCode") Integer statusCode) {
        super(statusCode);
    }
}
