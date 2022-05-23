package sygeim.dispatch.component;

import io.micronaut.http.annotation.*;
import jakarta.inject.Inject;
import sygeim.dispatch.component.commands.DispatchCrewCreateCommand;
import sygeim.dispatch.component.commands.DispatchCrewUpdateCommand;
import sygeim.dispatch.component.domain.Dispatch;
import sygeim.dispatch.component.domain.DispatchCrew;

import java.util.List;
import java.util.Optional;

@Controller("/dispatchCrew")
public class DispatchCrewController {
    @Inject
    DispatchCrewRepositoryImpl dispatchCrewRepository;

    @Post("/")
    public DispatchCrew create(@Body DispatchCrewCreateCommand dispatchCrew) {
        return dispatchCrewRepository.create(dispatchCrew);
    }

    @Get("/dispatch/{id}")
    public Optional<List<DispatchCrew>> findByDispatch(Long id) {
        return dispatchCrewRepository.findByDispatch(id);
    }

    @Get("/{id}")
    public Optional<DispatchCrew> findById(Long id) {
        return dispatchCrewRepository.findById(id);
    }

    @Put("/{document}")
    public int update(String document, @Body DispatchCrewUpdateCommand dispatchCrew) {
        return dispatchCrewRepository.update(document, dispatchCrew);
    }

    @Delete("/{document}")
    public int delete(String document) {
       return   dispatchCrewRepository.delete(document);
    }
}

