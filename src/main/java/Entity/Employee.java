package Entity;

import javax.persistence.*;
import java.util.Date;
@Entity
@Table(name="EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID", nullable=false,unique = true,length = 11)
    private int id;
    @Column(name = "NAME",length = 20,nullable = true)
    private String name;
    @Column(name = "ROLE",length = 20,nullable = true)
    private String role;
    @Column(name = "insert_time")
    private Date insertTime;

    public Date getInsertTime() {
        return insertTime;
    }

    public void setInsertTime(Date insertTime) {
        this.insertTime = insertTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }



}
