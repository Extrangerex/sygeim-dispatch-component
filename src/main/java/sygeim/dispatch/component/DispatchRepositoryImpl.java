package sygeim.dispatch.component;

import jakarta.inject.Inject;
import sygeim.dispatch.component.commands.DispatchCreateCommand;
import sygeim.dispatch.component.commands.DispatchUpdateCommand;
import sygeim.dispatch.component.domain.Dispatch;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

public class DispatchRepositoryImpl implements DispatchRepository {

    @Inject
    EntityManager entityManager;


    @Override
    public Dispatch create(DispatchCreateCommand dispatchCreateCommand) {
        Dispatch dispatch = new Dispatch();
        dispatch.setShipRegistration(dispatchCreateCommand.getShipRegistration());
        dispatch.setCaptainId(dispatchCreateCommand.getCapitanId());
        dispatch.setDeparturePort(dispatchCreateCommand.getDeparturePort());
        dispatch.setDepartureTime(dispatchCreateCommand.getDepartureTime());
        dispatch.setDestination(dispatchCreateCommand.getDestination());
        dispatch.setTripReason(dispatchCreateCommand.getTripReason());
        dispatch.setArrivalTime(dispatchCreateCommand.getArrivalTime());

        entityManager.persist(dispatch);

        return dispatch;
    }

    @Override
    public int update(Long id ,DispatchUpdateCommand dispatchUpdateCommand) {
        Dispatch dispatch = entityManager.find(Dispatch.class, id);

        dispatch.setShipRegistration(dispatchUpdateCommand.getShipRegistration() != null ? dispatchUpdateCommand.getShipRegistration() : dispatch.getShipRegistration());
        dispatch.setCaptainId(dispatchUpdateCommand.getCapitanId() != null ? dispatchUpdateCommand.getCapitanId() : dispatch.getCaptainId());
        dispatch.setDeparturePort(dispatchUpdateCommand.getDeparturePort() != null ? dispatchUpdateCommand.getDeparturePort() : dispatch.getDeparturePort());
        dispatch.setDepartureTime(dispatchUpdateCommand.getDepartureTime() != null ? dispatchUpdateCommand.getDepartureTime() : dispatch.getDepartureTime());
        dispatch.setDestination(dispatchUpdateCommand.getDestination() != null ? dispatchUpdateCommand.getDestination() : dispatch.getDestination());
        dispatch.setTripReason(dispatchUpdateCommand.getTripReason() != null ? dispatchUpdateCommand.getTripReason() : dispatch.getTripReason());
        dispatch.setArrivalTime(dispatchUpdateCommand.getArrivalTime() != null ? dispatchUpdateCommand.getArrivalTime() : dispatch.getArrivalTime());

        return entityManager.merge(dispatch).getId() != null ? 1 : 0;
    }

    @Override
    public Optional<Dispatch> findById(Long id) {
        return Optional.ofNullable(entityManager.find(Dispatch.class, id));
    }

    @Override
    public int delete(Long id) {
        Dispatch dispatch1 = entityManager.find(Dispatch.class, id);

        dispatch1.setDeleted(false);

        return entityManager.merge(dispatch1).getId() != null ? 1 : 0;

    }

    @Override
    public Optional<List<Dispatch>> findAll() {
        return Optional.ofNullable(entityManager.createQuery("SELECT d FROM Dispatch d", Dispatch.class).getResultList());
    }
}
