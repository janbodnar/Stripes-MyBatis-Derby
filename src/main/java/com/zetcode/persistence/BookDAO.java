package com.zetcode.persistence;

import com.zetcode.bean.Book;
import java.util.List;

public interface BookDAO {

  public void saveBook(Book car);
  public Book findBook(Long id);
  public List<Book> findAll();
}
