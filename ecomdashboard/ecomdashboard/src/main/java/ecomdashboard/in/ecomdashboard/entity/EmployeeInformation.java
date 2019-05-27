package ecomdashboard.in.ecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

import java.sql.Date;

/**
 * Created by Ramjeet on 01/04/19.
 */

@Entity
@Table(name="EmployeeInformation")
@Data
public class EmployeeInformation extends KeyEntity{

    private String _name;
    private String position;
    private String officeLocation;
    private int age;
    private Date startDate;
    private double salary;

   
}