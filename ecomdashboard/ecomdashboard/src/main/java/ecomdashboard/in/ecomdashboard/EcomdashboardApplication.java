package ecomdashboard.in.ecomdashboard;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages="ecomdashboard.in.ecomdashboard.entity")
@EnableJpaRepositories(basePackages="ecomdashboard.in.ecomdashboard.repositories")
public class EcomdashboardApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcomdashboardApplication.class, args);
	}
}
