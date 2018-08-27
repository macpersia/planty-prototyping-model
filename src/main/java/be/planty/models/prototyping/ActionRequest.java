package be.planty.models.prototyping;

import com.fasterxml.jackson.annotation.JsonCreator;

public class ActionRequest {

    public final String action;

    @JsonCreator
    public ActionRequest(String action) {
        this.action = action;
    }
}
