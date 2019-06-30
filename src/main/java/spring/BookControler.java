package spring;

import model.AuthorRating;
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

    /**
     * Returns the object with books so that the client can view the source data.
     *
     * @return   Object with all books as json
     */
    @RequestMapping("/books")
    public Books getAllBooks(){
        return bookService.getAllBooks();
    }

    /**
     * Returns books from a given category
     *
     * @param category A category of books to find
     * @return returns a list of books as json
     */
    @RequestMapping("/books/category/{category}")
    public List<BookByCategory> getBookByCategory(@PathVariable String category){
        return bookService.getBookByCategory(category);
    }

    /**
     * Returns a book identified by the given ISBN number in the form of a JSON document or return a
     * 404 if the book does not exists in the data set.
     *
     * @param isbn given ISBN number
     * @return returns the book assigned to the specified isbn, or returns error 400
     */
    @RequestMapping("/books/isbn/{isbn}")
    public ResponseEntity<BookByISBN> getBookByISBN(@PathVariable String isbn){
        BookByISBN book = bookService.getBookByISBN(isbn);
        return ResponseEntity.status(book == null ? HttpStatus.BAD_REQUEST : HttpStatus.OK).body(book);
    }

    /**
     * Returns the author's raiting
     *
     * @return List of authors and their rating as json
     */
    @RequestMapping("/books/rating")
    public ResponseEntity<List<AuthorRating>> getAuthorRating(){
        List<AuthorRating> book = bookService.getAuthorRating();
        return new ResponseEntity<List<AuthorRating>>(book  == null ?HttpStatus.BAD_REQUEST : HttpStatus.OK);
    }
}
