package ecomdashboard.in.ecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


/**
 * Created by Ramjeet on 01/04/19.
 */
@Entity
@Table(name="OrderRecieved")
@Data
public class OrderRecieved extends KeyEntity{

    private int orderReceived;
    private String dateReceived;
}