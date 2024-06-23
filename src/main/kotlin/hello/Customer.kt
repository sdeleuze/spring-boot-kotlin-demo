package hello

import org.springframework.data.annotation.Id
import org.springframework.data.relational.core.mapping.Table

@Table
data class Customer(
		val firstName: String,
		val lastName: String,
		@Id
		val id: Long? = null)
