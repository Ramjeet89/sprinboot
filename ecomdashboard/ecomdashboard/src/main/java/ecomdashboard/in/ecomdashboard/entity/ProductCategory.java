package ecomdashboard.in.ecomdashboard.entity;

import javax.persistence.Entity;
import javax.persistence.Table;

import lombok.Data;


/**
 * Created by Ramjeet on 01/04/19.
 */
@Entity
@Table(name="ProductCategory")
@Data
public class ProductCategory extends KeyEntity{
    private String categoryName;
    private int percentage;
    private boolean bestCategory;
}