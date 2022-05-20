package v3aplikasi.dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;
import v3aplikasi.model.entity.EmployeeEntity;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.Collection;

@Repository
public class EmployeeDAOImpl implements EmployeeDAO{
    @PersistenceContext
    private EntityManager entityManager;

    @SuppressWarnings("unchecked")
    @Override
    public Collection<EmployeeEntity> listEmployee() throws Exception{
        Session session = entityManager.unwrap(Session.class);
        String hql = "from EmployeeEntity";
        Query query = session.createQuery(hql);
        return query.list();
    }

    @Override
    public EmployeeEntity getEmployee(int idEmployee) throws Exception{
        Session session = entityManager.unwrap(Session.class);
        String hql = "from EmployeeEntity where id_number = :idEmployee";
        Query query = session.createQuery(hql);
        query.setInteger("idEmployee", idEmployee);
        if(query.list().size()>0){
            return(EmployeeEntity) query.list().get(0);
        } else{
            return null;
        }
    }

    @Override
    public void insertEmployee(EmployeeEntity employeeEntity) throws Exception{
        Session session = entityManager.unwrap(Session.class);
        session.save(employeeEntity);
    }

    @Override
    public void updateEmployee(EmployeeEntity employeeEntity) throws Exception{
        Session session = entityManager.unwrap(Session.class);
        session.update(employeeEntity);
    }

    @Override
    public void deleteEmployee(EmployeeEntity employeeEntity) throws Exception{
        Session session = entityManager.unwrap(Session.class);
        session.delete(employeeEntity);
    }
}
