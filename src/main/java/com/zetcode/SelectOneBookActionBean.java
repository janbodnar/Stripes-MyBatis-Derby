package com.zetcode.action;

import com.zetcode.bean.Book;
import com.zetcode.services.BookService;
import java.io.IOException;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;

public class SelectOneBookActionBean implements ActionBean {
    
    private static final String VIEW = "/showOneBook.jsp";
    private ActionBeanContext context;    
    
    private Book book;
    
    @Validate(required=true)
    private Long bookId;

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Long getBookId() {
        return bookId;
    }

    public void setBookId(Long bookId) {
        this.bookId = bookId;
    }
    
    @DefaultHandler
    public Resolution showOneBook() throws IOException {
        
        this.book = BookService.getBook(bookId);

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
