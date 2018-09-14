package fr.b4.apps.documentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = "fr.b4.apps.documentation")
@EntityScan(basePackages = "fr.b4.apps.documentation")
@ComponentScan(basePackages = {"fr.b4.apps.documentation", "fr.b4.apps.documentation.config"})
public class Main {

	public static void main(String[] args) {
		SpringApplication.run(Main.class, args);
	}
}
