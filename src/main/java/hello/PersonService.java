package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by hariharank12 on 31/07/17.
 */

@Service("personService")
@Transactional
public class PersonService {

    //@Autowired
    private PersonRepository personRepository;


    public PersonService(PersonRepository personRepository) {
        this.personRepository = personRepository;
    }


    public List<Person> retrieveAllPersons() {
        return personRepository.findAll();
    }

}
