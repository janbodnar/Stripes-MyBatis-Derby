package com.zetcode.service;

import com.zetcode.bean.Book;
import com.zetcode.persistence.MyBatisDAO;
import java.util.List;

public class BookService {

    public static void saveBook(Book book) {
        
        MyBatisDAO mbd = new MyBatisDAO();
        mbd.saveBook(book);
    }
    
    public static List<Book> getAllBooks() {
        
        MyBatisDAO mbd = new MyBatisDAO();
        List<Book> books = mbd.findAll();
        
        return books;
    }
    
    public static Book getBook(Long id) {

        MyBatisDAO mbd = new MyBatisDAO();
        Book book = mbd.findBook(id);

        return book;
    }    
}
