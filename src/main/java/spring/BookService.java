package spring;

import json.CreateBookByISBN;
import json.ReadJSON;
import model.BookByISBN;
import model.Books;
import org.springframework.stereotype.Service;

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
        return CreateBookByISBN.bookByISBN(books, isbn);
    }

}
