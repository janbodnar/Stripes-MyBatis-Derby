package com.zetcode.action;

import com.zetcode.bean.Book;
import com.zetcode.service.BookService;
import net.sourceforge.stripes.action.ActionBean;
import net.sourceforge.stripes.action.ActionBeanContext;
import net.sourceforge.stripes.action.DefaultHandler;
import net.sourceforge.stripes.action.ForwardResolution;
import net.sourceforge.stripes.action.Resolution;
import net.sourceforge.stripes.validation.Validate;

public class AddBookActionBean implements ActionBean {

    private static final String VIEW = "/bookAdded.jsp";
    private ActionBeanContext context;
    
    @Validate(required=true)
    private String author;
    
    @Validate(required=true)
    private String title;
    
    @Validate(required=true)
    private int yearPublished;
    
    @Validate(required=true)
    private String remark;    

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublished() {
        return yearPublished;
    }

    public void setPublished(int published) {
        this.yearPublished = published;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }
  
    @DefaultHandler
    public Resolution addBook() {
        
        Book book = new Book(this.author, this.title, 
                this.yearPublished, this.remark);
        BookService.saveBook(book);

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
