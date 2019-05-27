package ecomdashboard.in.ecomdashboard.repositories;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import ecomdashboard.in.ecomdashboard.entity.CompanyRevenue;

/**
 * Created by Ramjeet on 01/04/19.
 */
@Repository
@Qualifier(value = "companyRevenueRepository")
public interface CompanyRevenueRepository extends JpaRepository<CompanyRevenue,Long>{
	
}