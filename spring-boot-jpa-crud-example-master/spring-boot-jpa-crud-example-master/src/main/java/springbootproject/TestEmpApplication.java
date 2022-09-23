package springbootproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@SpringBootApplication
@EnableWebSecurity
public class TestEmpApplication {

	public static void main(String[] args) {
		SpringApplication.run(TestEmpApplication.class, args);
	}

	@Bean
	public static PasswordEncoder passwordEncoder()
	{
		return  NoOpPasswordEncoder.getInstance();
	}

}
