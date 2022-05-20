package v3aplikasi.model.dto;

import v3aplikasi.model.entity.EmployeeEntity;
import v3aplikasi.model.entity.PositionEntity;

import java.util.Date;
import java.util.List;

public class EmployeeDto {
//    private List<PositionEntity> positionEntities;
//    private EmployeeEntity employeeEntity;
//
//    public List<PositionEntity> getPositionEntities() {
//        return positionEntities;
//    }
//
//    public void setPositionEntities(List<PositionEntity> positionEntities) {
//        this.positionEntities = positionEntities;
//    }
//
//    public EmployeeEntity getEmployeeEntity() {
//        return employeeEntity;
//    }
//
//    public void setEmployeeEntity(EmployeeEntity employeeEntity) {
//        this.employeeEntity = employeeEntity;
//    }

    private Integer id;
    private String name;
    private Date birth_date;
    private Integer id_number;
    private Integer gender;
    private Integer is_delete;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public Integer getId_number() {
        return id_number;
    }

    public void setId_number(Integer id_number) {
        this.id_number = id_number;
    }

    public Integer getGender() {
        return gender;
    }

    public void setGender(Integer gender) {
        this.gender = gender;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }
}
