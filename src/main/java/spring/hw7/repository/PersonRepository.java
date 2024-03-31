package spring.hw7.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import spring.hw7.model.Person;

import java.util.Optional;

public interface PersonRepository extends JpaRepository<Person, Long> {
    Optional<Person> findByLogin(String login);

}
