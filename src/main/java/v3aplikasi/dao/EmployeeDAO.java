package v3aplikasi.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import v3aplikasi.model.entity.EmployeeEntity;

import java.util.Collection;
import java.util.List;

public interface EmployeeDAO extends JpaRepository<EmployeeEntity, Integer> {
//    public Collection<EmployeeEntity> listEmployee() throws Exception;
//    public EmployeeEntity getEmployee(int idEmployee) throws Exception;
//    public void insertEmployee(EmployeeEntity employeeEntity) throws Exception;
//    public void updateEmployee(EmployeeEntity employeeEntity) throws Exception;
//    public void deleteEmployee(EmployeeEntity employeeEntity) throws Exception;
}
