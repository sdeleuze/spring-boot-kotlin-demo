package hello;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//import org.springframework.transaction.annotation.Transactional;

/**
 * Created by hariharank12 on 31/07/17.
 */
@RestController
public class PersonController {

    private static Logger log = LoggerFactory.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @GetMapping("/findAll")
    @ResponseBody
    @Transactional(readOnly = true)
    public List<Person> retrieveAllPersons() {
        log.info("Find All in PersonController");
        List<Person> persons = this.personService.retrieveAllPersons();
        log.info(persons.toString());
        return persons;
    }

}
