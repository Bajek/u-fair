package pl.ubytes.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.web.PagedResourcesAssembler;
import org.springframework.hateoas.PagedResources;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pl.ubytes.entities.Book;
import pl.ubytes.entities.BookStatus;
import pl.ubytes.repository.BookStatusRepository;
import pl.ubytes.service.BookService;

import java.util.List;

/**
 * Created by Bajek on 05.12.2015.
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    Logger logger = LoggerFactory.getLogger(BookController.class);

    @Autowired
    BookService bookService;


    @RequestMapping(value = "/list", method = RequestMethod.GET, produces = {MediaType.APPLICATION_JSON_VALUE})
    @ResponseBody
    HttpEntity list(Pageable pageable, Sort sort, PagedResourcesAssembler assembler) {
        Page<Book> books = bookService.getAvailableBooks(
                new PageRequest(pageable.getPageNumber(), pageable.getPageSize(), sort));
        return new ResponseEntity(assembler.toResource(books), HttpStatus.OK);
    }

    @RequestMapping(value = "/add-one", method = RequestMethod.POST)
    void addOne(@RequestBody Book book) {
        bookService.addBook(book);
    }

    @RequestMapping(value = "/buy/{id}", method = RequestMethod.PUT)
    void buyBook(@PathVariable Long id, @RequestBody BookStatus bookStatus) {
        bookService.buyBook(id, bookStatus);
    }
}
