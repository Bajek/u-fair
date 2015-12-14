package pl.ubytes.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import pl.ubytes.entities.Book;

import java.util.List;

/**
 * Created by Bajek on 05.12.2015.
 */

public interface BookRepository extends CrudRepository<Book, Long> {

    List<Book> findByBoughtIsNotNull();

    List<Book> findByBought(Integer bought);

    Page<Book> findByBought(Integer bought, Pageable pageable);

}

