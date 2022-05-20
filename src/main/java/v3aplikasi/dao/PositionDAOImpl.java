package v3aplikasi.dao;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import v3aplikasi.model.entity.PositionEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class PositionDAOImpl implements PositionDAO{
    @PersistenceContext
    private EntityManager entityManager;
    @SuppressWarnings("unchecked")
    @Override
    public Collection<PositionEntity> listPosition() throws Exception{
        Session session = entityManager.unwrap(Session.class);
        String hql = "from PositionEntity ";
        Query query = session.createQuery(hql);
        return query.list();
    }
}
