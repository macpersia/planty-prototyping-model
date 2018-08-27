package be.planty.models.prototyping;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ActionResponse {

    public final int statusCode;

    @JsonCreator
    public ActionResponse(int statusCode) {
        this.statusCode = statusCode;
    }
}
