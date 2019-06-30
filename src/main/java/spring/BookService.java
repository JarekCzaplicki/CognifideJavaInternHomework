package spring;

import model.AuthorRating;
import model.BookByCategory;
import model.BookByISBN;
import tool.CreateAuthorRating;
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


    /**
     * Returns the object with books
     *
     * @return   Object with all books as json
     */
    public Books getAllBooks(){
        return books;
    }

    /**
     * Returns a book identified by the given ISBN number in the form of a JSON document
     *
     * @param isbn given ISBN number
     * @return returns the book assigned to the specified isbn, or returns NULL
     */
    public BookByISBN getBookByISBN(String isbn){
        BookByISBN book = CreateBookByISBN.bookByISBN(books, isbn);
        return book;
    }


    /**
     * Returns books from a given category
     *
     * @param category A category of books to find
     * @return returns a list of books as json
     */
    public List<BookByCategory> getBookByCategory(String category) {
        List<BookByCategory> book = CreateBookByCategory.bookByCategory(books, category);
        return book;
    }

    /**
     * Returns the author's raiting
     *
     * @return List of authors and their rating as json
     */
    public List<AuthorRating> getAuthorRating() {
        List<AuthorRating> rating = CreateAuthorRating.authorRating(books);
        return rating;
    }
}
