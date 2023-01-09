package hello

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
class Customer(
		var firstName: String,
		var lastName: String,
		@Id @GeneratedValue
		var id: Long = -1)
