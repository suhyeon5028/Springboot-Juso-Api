package site.metacoding.springbootjusoapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class SpringbootjusoapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootjusoapiApplication.class, args);
	}

}
