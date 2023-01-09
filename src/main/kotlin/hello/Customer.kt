package hello

import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.Id

@Entity
data class Customer(
		val firstName: String,
		val lastName: String,
		@Id @GeneratedValue
		val id: Long = -1)
