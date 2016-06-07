package com.zetcode.persistence;

import com.zetcode.bean.Book;
import com.zetcode.util.ServiceLocator;
import java.util.List;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class MyBatisDAO implements BookDAO {

    @Override
    public void saveBook(Book book) {
        
        SqlSession session = null;
        
        try {
            SqlSessionFactory factory = ServiceLocator.getSessionFactory();
            session = factory.openSession();
            session.insert("insertBook", book);
            session.commit();
            
        } finally {
            
            if (session != null) {
                session.close();
            }
        }        
    }

    @Override
    public Book findBook(Long id) {
        
        SqlSession session = null;
        Book book = null;
        
        try {
            SqlSessionFactory factory = ServiceLocator.getSessionFactory();
            session = factory.openSession();
            book = session.selectOne("selectBook", id);
            
        } finally {
            
            if (session != null) {
                session.close();
            }
        }

        return book;        
    }

    @Override
    public List<Book> findAll() {

        SqlSession session = null;
        List<Book> retrieveList = null;

        try {
            SqlSessionFactory factory = ServiceLocator.getSessionFactory();
            session = factory.openSession();
            retrieveList = session.selectList("selectAllBooks");
            
        } finally {
            
            if (session != null) {
                session.close();
            }
        }

        return retrieveList;
    }
}
