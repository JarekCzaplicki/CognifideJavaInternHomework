package spring;

import model.BookByCategory;
import model.BookByISBN;
import model.Books;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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

    @RequestMapping("/books/category/{category}")
    public List<BookByCategory> getBookByCategory(@PathVariable String category){
        return bookService.getBookByCategory(category);
    }

    @RequestMapping("/books/isbn/{isbn}")
    public ResponseEntity<BookByISBN> getBookByISBN(@PathVariable String isbn){
        BookByISBN book = bookService.getBookByISBN(isbn);
        System.out.println(book);
        return ResponseEntity.status(book == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK).body(book);
    }
}
