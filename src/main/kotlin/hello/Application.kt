package hello

import org.slf4j.LoggerFactory
import org.springframework.boot.CommandLineRunner
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean

@SpringBootApplication
class Application {

    @Bean
    fun init(repository: CustomerRepository) = CommandLineRunner {
        // save a couple of customers
        repository.save(Customer("Taro", "Tanaka", "HelloWorld"))
        repository.save(Customer("Chloe", "O'Brian", "helloWorld"))
        repository.save(Customer("Kim", "Bauer", "HelloWorld"))
        repository.save(Customer("David", "Palmer", "HelloWorld"))
        repository.save(Customer("Michelle", "Dessler", "HelloWorld"))
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}
