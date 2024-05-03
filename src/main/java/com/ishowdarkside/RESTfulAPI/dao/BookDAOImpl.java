package com.ishowdarkside.RESTfulAPI.dao;

import com.ishowdarkside.RESTfulAPI.entity.Book;
import jakarta.persistence.EntityManager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class BookDAOImpl implements BookDAO{


    private EntityManager entityManager;
    @Autowired
    public BookDAOImpl(EntityManager entityManager){
        this.entityManager = entityManager;
    }

    @Override
    public void save(Book book) {

        this.entityManager.persist(book);
    }
}
