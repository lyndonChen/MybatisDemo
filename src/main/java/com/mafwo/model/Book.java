package com.mafwo.model;

import java.io.Serializable;

/**
 * Created by hadoop on 14-7-9.
 */
public class Book implements Serializable {
    private Long id;
    private String bookName;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }
}
