package be.planty.models.prototyping;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public class ActionResponse<T> extends be.planty.models.assistant.ActionResponse {

    public final T body;

    @JsonCreator
    public ActionResponse(@JsonProperty("statusCode") Integer statusCode) {
        this(statusCode, null);
    }

    public ActionResponse(Integer statusCode, T body) {
        super(statusCode);
        this.body = body;
    }
}
