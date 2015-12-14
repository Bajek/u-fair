package pl.ubytes.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import pl.ubytes.entities.Book;
import pl.ubytes.entities.BookStatus;
import pl.ubytes.error.BookError;
import pl.ubytes.repository.BookRepository;
import pl.ubytes.repository.BookStatusRepository;
import pl.ubytes.service.BookService;

import java.util.List;

/**
 * Created by Bajek on 06.12.2015.
 */
@EnableTransactionManagement
@Service
public class DefaultBookService implements BookService {

    @Autowired
    BookRepository bookRepository;

    @Autowired
    BookStatusRepository bookStatusRepository;

    @Override
    public List<Book> getAvailableBooks() {
        return bookRepository.findByBought(0);
    }

    @Override
    public Page<Book> getAvailableBooks(Pageable pageable) {
        return bookRepository.findByBought(0, pageable);
    }

    @Override
    public void addBook(Book book) {
        BookStatus bs = new BookStatus();
        bs.setBook(book);
        bookRepository.save(book);
    }

    @Override
    public void buyBook(Long id, BookStatus bookStatus) {
        Book book = bookRepository.findOne(id);

        if (book == null) {
            throw new BookError("Book with id: " + id + " does not exist");
        }

        if (book.getBought().equals(1)) {
            throw new BookError("Book with id: " + id + " has been already bought");
        }

        book.setBought(1);
        bookRepository.save(book);
        bookStatus.setBook(book);
        bookStatusRepository.save(bookStatus);

    }
}
