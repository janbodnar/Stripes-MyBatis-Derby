package com.zetcode.bean;

public class Book {

    private Long id;

    private String author;
    private String title;
    private int yearPublished;
    private String remark;
    
    public Book() {};

    public Book(String author, String title, int published, 
            String remark) {
        
        this.author = author;
        this.title = title;
        this.yearPublished = published;
        this.remark = remark;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
}
