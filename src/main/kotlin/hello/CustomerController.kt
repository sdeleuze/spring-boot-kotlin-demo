package hello

import org.slf4j.LoggerFactory
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RestController
import org.springframework.transaction.annotation.Transactional

@RestController
@Transactional
class CustomerController(val service: CustomerService) {

	val log = LoggerFactory.getLogger(CustomerController::class.java)

	@GetMapping("/")
	fun findAll() : Iterable<Customer> {
		log.info("Find All in CustomerController")
		return service.retrieveAllCustomers()
	}

		@GetMapping("/{lastName}")
		fun findByLastName(@PathVariable lastName:String)
				= service.retrieveCustomerByLastName(lastName)

}