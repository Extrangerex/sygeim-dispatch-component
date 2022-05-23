package sygeim.dispatch.component;

import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import sygeim.dispatch.component.commands.DispatchCreateCommand;
import sygeim.dispatch.component.commands.DispatchUpdateCommand;
import sygeim.dispatch.component.domain.Dispatch;

import java.util.List;
import java.util.Optional;

@Controller("/dispatch")
public class DispatchController {

    @Inject
    DispatchRepositoryImpl dispatchRepository;

    @Get("/")
    public Optional<List<Dispatch>> findAll() {
        return dispatchRepository.findAll();
    }

    @Post("/")
    public Dispatch create(@Body DispatchCreateCommand dispatch) {
        return dispatchRepository.create(dispatch);
    }

    @Get("/{id}")
    public Optional<Dispatch> findById(@PathVariable("id") Long id) {
        return dispatchRepository.findById(id);
    }

    @Put("/{id}")
    public int update(@PathVariable("id") Long id, @Body DispatchUpdateCommand dispatch) {
        return dispatchRepository.update(id, dispatch);
    }

    @Delete("/{id}")
    public int delete(@PathVariable("id") Long id) {
        return dispatchRepository.delete(id);
    }
}