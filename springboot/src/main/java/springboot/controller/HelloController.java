package springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
@RequestMapping("/springmvc")
public class HelloController {
	@RequestMapping("hello")
	public String sayHello(){
		return "hello spring boot";
	}
}
