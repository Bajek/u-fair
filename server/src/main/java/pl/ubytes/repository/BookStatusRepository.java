package pl.ubytes.repository;

import org.springframework.data.repository.CrudRepository;
import pl.ubytes.entities.BookStatus;

/**
 * Created by Bartłomiej on 07.12.2015.
 */
public interface BookStatusRepository extends CrudRepository<BookStatus, Long> {
}
