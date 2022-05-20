package v3aplikasi.model.entity;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "T1_POSITION")
public class PositionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", length = 11, nullable = false)
    private Integer id;
    @Column(name = "CODE", length = 50, nullable = false)
    private String code;
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;
    @Column(name = "IS_DELETE", length = 11, nullable = false)
    private Integer is_delete;
    @OneToMany(mappedBy = "positionID")
    private Set<EmployeeEntity> employeeEntity = new HashSet<>();

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIs_delete() {
        return is_delete;
    }

    public void setIs_delete(Integer is_delete) {
        this.is_delete = is_delete;
    }

    public Set<EmployeeEntity> getEmployeeEntity() {
        return employeeEntity;
    }

    public void setEmployeeEntity(Set<EmployeeEntity> employeeEntity) {
        this.employeeEntity = employeeEntity;
    }
}
