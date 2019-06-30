package tool;

import model.BookByCategory;
import model.Books;
import model.IndustryIdentifier;
import model.Item;

import java.util.ArrayList;
import java.util.List;
public class CreateBookByCategory {
  /**
   * Returns books from a given category
   *
   * @param books object containing the input json file
   * @param category A category of books to find
   * @return returns a list of books as json
   */
  public static List<BookByCategory> bookByCategory(Books books, String category) {
    List<BookByCategory> bookByCategoryList = new ArrayList<>();
    for (Item item : books.getItems()) {
      List<String> categories = item.getVolumeInfo().getCategories();
      if (categories!=null){
        for (String ca : categories) {
          if(ca.contains(category)){
            BookByCategory bookByCategory = new BookByCategory();
            for (IndustryIdentifier industryIdentifier: item.getVolumeInfo().getIndustryIdentifiers())
            bookByCategory.setIsbn(industryIdentifier.getIdentifier());
            if (item.getVolumeInfo().getTitle() != null)
              bookByCategory.setTitle(item.getVolumeInfo().getTitle());
            if (item.getVolumeInfo().getPublisher() != null)
              bookByCategory.setPublisher(item.getVolumeInfo().getPublisher());
            if (item.getVolumeInfo().getPublishedDate() != null)
              bookByCategory.setPublishedDate(DateToEpoch.dateToEpoh(item.getVolumeInfo().getPublishedDate()));
            if (item.getVolumeInfo().getDescription() != null)
              bookByCategory.setDescription(item.getVolumeInfo().getDescription().substring(0,(item.getVolumeInfo().getDescription().indexOf(".")+1)));
            if (item.getVolumeInfo().getPageCount() != null)
              bookByCategory.setPageCount(item.getVolumeInfo().getPageCount());
            if (item.getVolumeInfo().getImageLinks().getThumbnail() != null)
              bookByCategory.setThumbnailUrl(item.getVolumeInfo().getImageLinks().getThumbnail());
            if (item.getVolumeInfo().getLanguage() != null)
              bookByCategory.setLanguage(item.getVolumeInfo().getLanguage());
            if (item.getVolumeInfo().getPreviewLink() != null)
              bookByCategory.setPreviewLink(item.getVolumeInfo().getPreviewLink());
            if (item.getVolumeInfo().getAuthors() != null)
              bookByCategory.setAuthors(item.getVolumeInfo().getAuthors());
            if (item.getVolumeInfo().getCategories() != null)
              bookByCategory.setCategories(item.getVolumeInfo().getCategories());
            if (bookByCategory!=null)bookByCategoryList.add(bookByCategory);
          }
        }
      }
    }
    if(bookByCategoryList.size()==0) return null;
        else return bookByCategoryList;
  }

}
