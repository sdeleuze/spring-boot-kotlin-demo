package hello

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
open class Application {

	private val log = LoggerFactory.getLogger(Application::class.java)

	@Bean
	open fun init(repository: CustomerRepository) = CommandLineRunner {
			// save a couple of customers
			repository.save(Customer("Jack", "Bauer"))
			repository.save(Customer("Chloe", "O'Brian"))
			repository.save(Customer("Kim", "Bauer"))
			repository.save(Customer("David", "Palmer"))
			repository.save(Customer("Michelle", "Dessler"))

			// fetch all customers
			log.info("Customers found with findAll():")
			log.info("-------------------------------")
			for (customer in repository.findAll()) {
				log.info(customer.toString())
			}
			log.info("")

			// fetch an individual customer by ID
			val customer = repository.findOne(1L)
			log.info("Customer found with findOne(1L):")
			log.info("--------------------------------")
			log.info(customer.toString())
			log.info("")

			// fetch customers by last name
			log.info("Customer found with findByLastName('Bauer'):")
			log.info("--------------------------------------------")
			for (bauer in repository.findByLastName("Bauer")) {
				log.info(bauer.toString())
			}
			log.info("")
	}

}

fun main(args: Array<String>) {
	SpringApplication.run(Application::class.java, *args)
}
