package v3aplikasi.service;

import v3aplikasi.model.entity.EmployeeEntity;

import java.util.Collection;

public interface EmployeeService {
    public Collection<EmployeeEntity> listEmployee() throws Exception;
    public EmployeeEntity getEmployee(int idEmployee) throws Exception;
    public void insertEmployee(EmployeeEntity employeeEntity) throws Exception;
    public void updateEmployee(EmployeeEntity employeeEntity) throws Exception;
    public void deleteEmployee(EmployeeEntity employeeEntity) throws Exception;
}
