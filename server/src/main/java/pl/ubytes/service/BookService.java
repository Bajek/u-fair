package pl.ubytes.service;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.transaction.annotation.Transactional;
import pl.ubytes.entities.Book;

import java.util.List;

/**
 * Created by Bartłomiej on 06.12.2015.
 */
public interface BookService {

    @Transactional
    List<Book> getAvailableBooks();

    @Transactional
    Page<Book> getAvailableBooks(Pageable pageable);

    @Transactional
    void addBook(Book book);
}
