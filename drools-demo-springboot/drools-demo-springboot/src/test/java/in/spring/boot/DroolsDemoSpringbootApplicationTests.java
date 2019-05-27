package in.spring.boot;

import in.spring.boot.model.Customer;
import in.spring.boot.service.CustomerService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import org.springframework.test.context.junit4.SpringRunner;

import static junit.framework.TestCase.assertEquals;
@RunWith(SpringRunner.class)
@SpringBootTest
public class DroolsDemoSpringbootApplicationTests {

	@Autowired
	CustomerService service;

	@Test
	public void testDiscount() {
		Customer customer1 = new Customer("Frank");
		customer1.setAge(4);

		Customer customer2 = new Customer("John");
		customer2.setAge(1);

		service.insertCustomer(customer1);
		service.insertCustomer(customer2);

		assertEquals(25, customer1.getDiscount());
		assertEquals(15, customer2.getDiscount());
	}
}
