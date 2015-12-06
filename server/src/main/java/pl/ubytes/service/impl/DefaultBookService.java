package pl.ubytes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import pl.ubytes.entities.Book;
import pl.ubytes.repository.BookRepository;
import pl.ubytes.service.BookService;

import java.util.List;

/**
 * Created by Bartłomiej on 06.12.2015.
 */
@EnableTransactionManagement
@Service
public class DefaultBookService implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Transactional
    public List<Book> getAvailableBooks() {
        return bookRepository.findByBought(0);
    }
}
