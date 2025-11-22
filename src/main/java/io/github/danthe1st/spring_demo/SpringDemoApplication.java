package io.github.danthe1st.spring_demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDemoApplication implements CommandLineRunner {
	
	private final TestRepo repo;
	
	public SpringDemoApplication(TestRepo repo) {
		this.repo = repo;
	}

	public static void main(String[] args) {
		SpringApplication.run(SpringDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		repo.getAllByName("abc");
	}
	
}
