package sygeim.dispatch.component.commands;

import io.micronaut.core.annotation.Introspected;
import sygeim.dispatch.component.domain.Dispatch;

import javax.validation.constraints.NotNull;

@Introspected
public class DispatchCrewUpdateCommand {
    private Dispatch dispatch;

    public Dispatch getDispatch() {
        return dispatch;
    }

    public void setDispatch(Dispatch dispatch) {
        this.dispatch = dispatch;
    }
}
