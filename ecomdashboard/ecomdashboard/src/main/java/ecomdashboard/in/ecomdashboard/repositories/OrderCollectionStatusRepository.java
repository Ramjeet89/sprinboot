package ecomdashboard.in.ecomdashboard.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecomdashboard.in.ecomdashboard.entity.OrderCollectionStatus;

/**
 * Created by Ramjeet on 01/04/19.
 */
@Repository
@Qualifier(value = "orderCollectionStatusRepository")
public interface OrderCollectionStatusRepository extends JpaRepository<OrderCollectionStatus, Long> {
}