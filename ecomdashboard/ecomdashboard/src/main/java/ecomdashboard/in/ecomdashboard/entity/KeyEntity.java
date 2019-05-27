package ecomdashboard.in.ecomdashboard.entity;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import lombok.Data;

@MappedSuperclass
@Data
public class KeyEntity {

    @Id
    @Column(name = "PK", unique = true)
    private String pk;
}