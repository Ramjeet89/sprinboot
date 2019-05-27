package ecomdashboard.in.ecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;

/**
 * Created by Ramjeet on 01/04/19.
 */

@Entity
@Table(name="OrderCollectionStatus")
@Data
public class OrderCollectionStatus extends KeyEntity{
    private int newOrders;
    private double revenue;
    private int shipped;
    private int returned;
}