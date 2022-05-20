package v3aplikasi.model.dto;

import v3aplikasi.model.entity.EmployeeEntity;
import v3aplikasi.model.entity.PositionEntity;

import java.util.List;

public class EmployeeDto {
    private List<PositionEntity> positionEntities;
    private EmployeeEntity employeeEntity;

    public List<PositionEntity> getPositionEntities() {
        return positionEntities;
    }

    public void setPositionEntities(List<PositionEntity> positionEntities) {
        this.positionEntities = positionEntities;
    }

    public EmployeeEntity getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
        this.employeeEntity = employeeEntity;
    }
}
