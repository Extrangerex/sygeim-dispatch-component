package sygeim.dispatch.component;

import sygeim.dispatch.component.commands.DispatchCreateCommand;
import sygeim.dispatch.component.commands.DispatchUpdateCommand;
import sygeim.dispatch.component.domain.Dispatch;

import java.util.List;
import java.util.Optional;

public interface DispatchRepository {
    Dispatch create(DispatchCreateCommand dispatchCreateCommand);
    int update(Long id ,DispatchUpdateCommand dispatchUpdateCommand);
    Optional<Dispatch> findById(Long id);
    int delete(Long id);
    Optional<List<Dispatch>> findAll();
}
