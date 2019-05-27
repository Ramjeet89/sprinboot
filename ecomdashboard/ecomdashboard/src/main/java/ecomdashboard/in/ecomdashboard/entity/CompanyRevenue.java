package ecomdashboard.in.ecomdashboard.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import lombok.Data;
/**
 * Created by Ramjeet on 01/04/19.
 */

@Entity
@Table(name = "companyRevenue")
@Data
public class CompanyRevenue extends KeyEntity {

	@Column(name = "Revenue_month", nullable = false)
	private String _month;

	@Column(name = "revenue", nullable = false)
	private double revenue;

	@Column(name = "expense")
	private double expense;

	@Column(name = "margin")
	private double margin;
}
