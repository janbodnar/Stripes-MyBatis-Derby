package com.zetcode.action;

import com.zetcode.bean.Book;
import com.zetcode.service.BookService;
import java.util.List;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;


public class SelectAllBooksActionBean implements ActionBean {
    
    private static final String VIEW = "/showAllBooks.jsp";
    private ActionBeanContext context;    
    private List<Book> books;

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }

    @DefaultHandler
    public Resolution showAll() {
        
        this.books = BookService.getAllBooks();

        return new ForwardResolution(VIEW);
    }

    @Override
    public void setContext(ActionBeanContext context) {

        this.context = context;
    }

    @Override
    public ActionBeanContext getContext() {
        
        return context;
    }
}
