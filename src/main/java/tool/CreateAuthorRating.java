package tool;

import model.AuthorRating;
import model.BookByCategory;
import model.Books;
import model.Item;

import java.util.ArrayList;
import java.util.List;
public class CreateAuthorRating {
  public static Double authorRating(Books books, String author) {
    List<AuthorRating> authorsRating = new ArrayList<>();
    for (Item item : books.getItems()) {
      List<String> authors = item.getVolumeInfo().getAuthors();
      if (author!=null){
        for (String ca : authors) {
          if(ca.contains(author)){
            AuthorRating authorRating = new AuthorRating();
            authorRating.setAuthor(author);
            authorRating.setAverageRating(item.getVolumeInfo().getAverageRating());

            //Converters.stringToJSON(bookByISBN);
            if (authorRating!=null)authors.add(authorRating);
          }
        }
      }
    }
    if(authors.size()==0) return null;
    else return bookByCategoryList;
  }
}
