package tool;

import model.AuthorRating;
import model.Books;
import model.Item;

import java.util.ArrayList;
import java.util.List;
public class CreateAuthorRating {
  public static List<AuthorRating> authorRating(Books books) {
    List<AuthorRating> authorsRating = new ArrayList<>();
    for (Item item : books.getItems()) {
      List<String> authors = item.getVolumeInfo().getAuthors();
      if (authors != null && item.getVolumeInfo().getAverageRating() != null){
        for (String ca : authors) {

            AuthorRating authorRating = new AuthorRating();
            authorRating.setAuthor(ca);
            authorRating.setAverageRating(item.getVolumeInfo().getAverageRating());
            authorsRating.add(authorRating);

        }
      }
    }
    if(authorsRating.size()==0) return null;
    else return authorsRating;
  }
}
