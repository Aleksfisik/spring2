package ru.org.spring.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.org.spring.model.Person;

public interface PersonRepository extends JpaRepository<Person,Long> {
}
