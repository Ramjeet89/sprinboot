package ecomdashboard.in.ecomdashboard.service;

import java.util.HashMap;
import java.util.List;

import ecomdashboard.in.ecomdashboard.entity.EmployeeInformation;
import ecomdashboard.in.ecomdashboard.entity.OrderCollectionStatus;
import ecomdashboard.in.ecomdashboard.entity.OrderRecieved;
import ecomdashboard.in.ecomdashboard.entity.ProductCategory;

/**
 * Created by Ramjeet on 01/04/19.
 */

public interface DashboardService {

	HashMap<String, Object> getTodayRevenueDash();

	List<ProductCategory> getBestCategory();

	List<OrderRecieved> getAllOrderRecieved();

	List<OrderCollectionStatus> getOrderCollection();

	List<EmployeeInformation> getAllEmployee();

	EmployeeInformation getEmployee(final String pk);

	EmployeeInformation addEmployee(EmployeeInformation employeeInformation);

	EmployeeInformation updateEmployee(EmployeeInformation employeeInformation);

	void deleteEmployee(EmployeeInformation employeeInformation);

}