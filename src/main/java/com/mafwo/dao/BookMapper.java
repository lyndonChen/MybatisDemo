package com.mafwo.dao;

import com.mafwo.model.Book;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * Created by hadoop on 14-7-9.
 */
public interface BookMapper {

    public Book getBook(Long id);
    public List<Book> getAll();
}
