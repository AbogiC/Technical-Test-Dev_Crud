package v3aplikasi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import v3aplikasi.dao.EmployeeDAO;
import v3aplikasi.model.entity.EmployeeEntity;

import java.util.Collection;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService{
    @Autowired
    private EmployeeDAO employeeDAO;
    @Override
    public Collection<EmployeeEntity> listEmployee() throws Exception{
        //TODO Auto-generated method stub
        return employeeDAO.listEmployee();
    }
    @Override
    public EmployeeEntity getEmployee(int idEmployee) throws Exception{
        //TODO Auto-generated method stub
        return employeeDAO.getEmployee(idEmployee);
    }
    @Override
    public void insertEmployee(EmployeeEntity employeeEntity) throws Exception{
        //TODO Auto-generated method stub
        employeeDAO.insertEmployee(employeeEntity);
    }
    @Override
    public void updateEmployee(EmployeeEntity employeeEntity) throws Exception{
        //TODO Auto-generated method stub
        employeeDAO.updateEmployee(employeeEntity);
    }
    @Override
    public void deleteEmployee(EmployeeEntity employeeEntity) throws Exception{
        //TODO Auto-generated method stub
        employeeDAO.deleteEmployee(employeeEntity);
    }
}
