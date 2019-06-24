package spring;

import model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Jarek Czaplicki
 */
@RestController
public class BookControler {

    @Autowired
    private BookService bookService;

    @RequestMapping("/books")
    public Books getAllBooks(){
        return bookService.getAllBooks();
    }
}
