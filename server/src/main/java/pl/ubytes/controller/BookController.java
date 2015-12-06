package pl.ubytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.ubytes.service.BookService;

import java.util.List;

/**
 * Created by Bajek on 05.12.2015.
 */
@RestController
@RequestMapping("/api/books")
public class BookController {

    @Autowired
    BookService bookService;


    @RequestMapping(value = "/get-available", method = RequestMethod.GET)
    @ResponseBody
    List getAvailable() {
        return bookService.getAvailableBooks();
    }
}
