package tool;

import model.BookByCategory;
import model.Books;
import model.Item;

import java.util.ArrayList;
import java.util.List;
public class CreateBookByCategory {
  public static List<BookByCategory> bookByCategory(Books books, String category) {
    List<BookByCategory> bookByCategoryList = new ArrayList<>();
    for (Item item : books.getItems()) {
      List<String> categories = item.getVolumeInfo().getCategories();
      if (categories!=null){
        for (String ca : categories) {
          if(ca.contains(category)){
            BookByCategory bookByCategory = new BookByCategory();
            bookByCategory.setTitle(item.getVolumeInfo().getTitle());
            if (item.getVolumeInfo().getPublisher() != null)
              bookByCategory.setPublisher(item.getVolumeInfo().getPublisher());
            if (item.getVolumeInfo().getPublishedDate() != null)
              bookByCategory.setPublishedDate(DateToEpoch.dateToEpoh(item.getVolumeInfo().getPublishedDate()));
            if (item.getVolumeInfo().getDescription() != null)
              bookByCategory.setDescription(item.getVolumeInfo().getDescription().substring(0,(item.getVolumeInfo().getDescription().indexOf(".")+1)));
            bookByCategory.setPageCount(item.getVolumeInfo().getPageCount());
            bookByCategory.setThumbnailUrl(item.getVolumeInfo().getImageLinks().getThumbnail());
            bookByCategory.setLanguage(item.getVolumeInfo().getLanguage());
            bookByCategory.setPreviewLink(item.getVolumeInfo().getPreviewLink());
            if (item.getVolumeInfo().getAuthors() != null)
              bookByCategory.setAuthors(item.getVolumeInfo().getAuthors());
            if (item.getVolumeInfo().getCategories() != null)
              bookByCategory.setCategories(item.getVolumeInfo().getCategories());
            System.out.println(bookByCategory);
            //Converters.stringToJSON(bookByISBN);
            if (bookByCategory!=null)bookByCategoryList.add(bookByCategory);
          }
        }
      }
    }
    if(bookByCategoryList.size()==0) return null;
        else return bookByCategoryList;
  }

}
