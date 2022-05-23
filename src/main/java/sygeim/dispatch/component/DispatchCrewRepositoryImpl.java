package sygeim.dispatch.component;

import jakarta.inject.Inject;
import jakarta.inject.Singleton;
import sygeim.dispatch.component.commands.DispatchCrewCreateCommand;
import sygeim.dispatch.component.commands.DispatchCrewUpdateCommand;
import sygeim.dispatch.component.domain.Dispatch;
import sygeim.dispatch.component.domain.DispatchCrew;

import javax.persistence.EntityManager;
import java.util.List;
import java.util.Optional;

@Singleton
public class DispatchCrewRepositoryImpl implements DispatchCrewRepository {

    @Inject
    EntityManager entityManager;

    @Override
    public DispatchCrew create(DispatchCrewCreateCommand dispatchCrew) {
        DispatchCrew dispatchCrew1 = new DispatchCrew();
        dispatchCrew1.setDispatch(dispatchCrew.getDispatch());
        dispatchCrew1.setDocument(dispatchCrew.getDocument());

        entityManager.persist(dispatchCrew1);

        return dispatchCrew1;
    }

    @Override
    public Optional<List<DispatchCrew>> findByDispatch(Long dispatchId) {
        Dispatch dispatch = entityManager.find(Dispatch.class, dispatchId);

        return Optional.ofNullable(entityManager.createQuery("select d from DispatchCrew d where d.dispatch.id = :dispatch", DispatchCrew.class).setParameter("dispatch", dispatch.getId()).getResultList());
    }

    @Override
    public Optional<DispatchCrew> findById(Long id) {
        return Optional.ofNullable(entityManager.find(DispatchCrew.class, id));
    }

    @Override
    public int delete(String id) {
        DispatchCrew dispatchCrew = entityManager.find(DispatchCrew.class, id);

        entityManager.remove(dispatchCrew);

        return 1;
    }

    @Override
    public int deleteByDispatch(Long dispatchId) {
        Dispatch dispatch = entityManager.find(Dispatch.class, dispatchId);

        return entityManager.createQuery("delete from DispatchCrew d where d.dispatch.id = :dispatch")
                .setParameter("dispatch", dispatch.getId())
                .executeUpdate();
    }

    @Override
    public int update(String document, DispatchCrewUpdateCommand dispatchCrew) {
        DispatchCrew dispatchCrew1 = entityManager.find(DispatchCrew.class, document);
        dispatchCrew1.setDispatch(dispatchCrew.getDispatch());

        return entityManager.merge(dispatchCrew1).getId() == null ? 0 : 1;
    }
}


