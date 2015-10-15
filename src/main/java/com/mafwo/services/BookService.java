package com.mafwo.services;

import com.mafwo.dao.BookMapper;
import com.mafwo.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by hadoop on 14-7-9.
 */
@Service
public class BookService {

    @Autowired
    private BookMapper bookMapper;

    public Book getBook(Long l){

        return bookMapper.getBook(l);
    }
    public List<Book> getAll(){
        return bookMapper.getAll();
    }
}
