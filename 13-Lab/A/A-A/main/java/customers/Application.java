package Lab13A.main.java.customers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {

	@Autowired
	private ICustomerService customerService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		customerService.addCustomer("Frank Brown", "fbrown@acme.com", "mainstreet 5", "Chicago", "60613");
	}
}
