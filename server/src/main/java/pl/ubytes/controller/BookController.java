package pl.ubytes.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import pl.ubytes.repository.BookRepository;

import java.util.List;

/**
 * Created by Bajek on 05.12.2015.
 */
@RestController
@RequestMapping("/books")
public class BookController {

    @Autowired
    BookRepository bookRepository;

    @RequestMapping(value = "/get-all", method = RequestMethod.GET)
    @Transactional
    @ResponseBody
    List getAll() {
        return (List)bookRepository.findAll();
    }

    @RequestMapping(value = "/get-available", method = RequestMethod.GET)
    @Transactional
    @ResponseBody
    List getAvailable() {
        return (List)bookRepository.findByBought(0);
    }
}
