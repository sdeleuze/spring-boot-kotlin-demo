package hello;

import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by hariharank12 on 31/07/17.
 */
public interface PersonRepository extends CrudRepository<Person, Long> {

    List<Person> findAll();

}
