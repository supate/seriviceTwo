package springbootsvc2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ServiceTwoController {
	
	@GetMapping("/hello")
	public String sayHello() {
		return "Hello";
	}
}
