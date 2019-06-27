package spring;

import model.BookByCategory;
import model.BookByISBN;
import tool.CreateBookByCategory;
import tool.CreateBookByISBN;
import tool.ReadJSON;
import model.Books;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Jarek Czaplicki
 */
@Service
public class BookService {
    Books books = ReadJSON.readJSON();



    public Books getAllBooks(){
        return books;
    }

    public BookByISBN getBookByISBN(String isbn){
        BookByISBN book = CreateBookByISBN.bookByISBN(books, isbn);
        return book;
    }

    public List<BookByCategory> getBookByCategory(String category) {
        List<BookByCategory> book = CreateBookByCategory.bookByCategory(books, category);
        return book;
    }
}
