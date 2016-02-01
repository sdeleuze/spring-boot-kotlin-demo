package hello;

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class CustomerController @Autowired constructor(val repository:CustomerRepository) {

    @RequestMapping("/")
    fun list(): Iterable<Customer> {
        return repository.findAll()
    }

}