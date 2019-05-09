package springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * springboot  start class or call boot class
 * @author Administrator
 *
 */
@SpringBootApplication // this is spring boot's boot class
public class Applicathon {

	public static void main(String[] args) {
		 System.out.println("start springboot");
		// SpringApplication.run(Applicathon.class, args);
		 SpringApplication application=new SpringApplication(Applicathon.class);
		 application.run(args);

	}

}
