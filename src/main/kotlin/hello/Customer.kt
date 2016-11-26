package hello

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
class Customer(
		var firstName: String = "",
		var lastName: String = "",
		@Id @GeneratedValue(strategy = GenerationType.AUTO)
		var id: Long = 0) {

	override fun toString(): String {
		return "Customer(id=$id, firstName='$firstName', lastName='$lastName')"
	}
}
