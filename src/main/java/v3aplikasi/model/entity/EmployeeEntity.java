package v3aplikasi.model.entity;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "T2_EMPLOYEE")
public class EmployeeEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID", length = 11, nullable = false)
    private Integer id;
    @Column(name = "NAME", length = 100, nullable = false)
    private String name;
    @Column(name = "BIRTH_DATE", nullable = false)
    private Date birth_date;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "POSITION_ID", referencedColumnName = "ID", nullable = false)
    private PositionEntity positionID;
    @Column(name = "ID_NUMBER", length = 11, nullable = false)
    private Integer id_number;
    @Column(name = "GENDER", length = 11, nullable = false)
    private Integer gender;
    @Column(name = "IS_DELETE", length = 11, nullable = false)
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

    public PositionEntity getPositionID() {
        return positionID;
    }

    public void setPositionID(PositionEntity positionID) {
        this.positionID = positionID;
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
