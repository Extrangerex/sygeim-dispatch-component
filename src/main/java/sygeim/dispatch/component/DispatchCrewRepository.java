package sygeim.dispatch.component;

import sygeim.dispatch.component.commands.DispatchCrewCreateCommand;
import sygeim.dispatch.component.commands.DispatchCrewUpdateCommand;
import sygeim.dispatch.component.domain.Dispatch;
import sygeim.dispatch.component.domain.DispatchCrew;

import java.util.List;
import java.util.Optional;

public interface DispatchCrewRepository {
    DispatchCrew create(DispatchCrewCreateCommand dispatchCrew);

    Optional<List<DispatchCrew>> findByDispatch(Long dispatchId);

    Optional<DispatchCrew> findById(Long id);

    int delete(String id);

    int deleteByDispatch(Long dispatchId);

    int update(String document , DispatchCrewUpdateCommand dispatchCrew);
}
