package com.ishowdarkside.RESTfulAPI.controller;


import com.ishowdarkside.RESTfulAPI.dao.BookDAO;
import com.ishowdarkside.RESTfulAPI.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/book")
public class BookController {


    private BookDAO bookDAO;
    @Autowired
    public BookController(BookDAO bookDAO){
        this.bookDAO = bookDAO;
    }

    @PostMapping("/")
    public String saveBook(@ModelAttribute Book book){

        this.bookDAO.save(book);
        return "Book saved successfully!";

    }


}
