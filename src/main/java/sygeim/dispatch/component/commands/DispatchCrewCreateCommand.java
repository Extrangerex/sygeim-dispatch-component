package sygeim.dispatch.component.commands;

import io.micronaut.core.annotation.Introspected;
import sygeim.dispatch.component.domain.Dispatch;

import javax.validation.constraints.NotNull;

@Introspected
public class DispatchCrewCreateCommand {
    @NotNull
    private String document;

    @NotNull
    private Dispatch dispatch;

    public String getDocument() {
        return document;
    }

    public void setDocument(String document) {
        this.document = document;
    }

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }
}
