package io.github.danthe1st.spring_demo;

import java.util.Set;

import org.springframework.data.repository.CrudRepository;

public interface TestRepo extends CrudRepository<Person, Long> {
	Set<Person> getAllByName(String name);
}
