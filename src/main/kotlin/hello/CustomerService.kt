package hello

import org.springframework.stereotype.Service
import org.springframework.transaction.annotation.Transactional

/**
 * Created by hariharank12 on 31/07/17.
 */

@Service("customerService")
@Transactional
class CustomerService(val repository: CustomerRepository) {

    fun retrieveAllCustomers(): Iterable<Customer> {
        return repository.findAll()
    }

    fun retrieveCustomerByLastName(lastName: String): Iterable<Customer> {
        return repository.findByLastName(lastName)
    }

}