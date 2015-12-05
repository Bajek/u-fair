package pl.ubytes.repository;

import org.springframework.data.repository.CrudRepository;
import pl.ubytes.entities.Book;

/**
 * Created by Bajek on 05.12.2015.
 */

public interface BookRepository extends CrudRepository<Book, Long> {

}

