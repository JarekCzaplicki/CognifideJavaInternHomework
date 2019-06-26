package spring;

import tool.ReadJSON;
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
}
