package spring.hw7.service;

import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;
import spring.hw7.model.Person;
import spring.hw7.repository.PersonRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class PersonService {

    private final PersonRepository repository;

    public List<Person> getAll() {
        return repository.findAll();
    }

    public Person findByLogin(String login) {
        return repository.findByLogin(login).orElseThrow(() ->
                new ResponseStatusException(HttpStatus.NOT_FOUND, "Нет пользователя с login " + login));
    }

    public List<Person> findAllPersons() {
        return repository.findAll();
    }
}
