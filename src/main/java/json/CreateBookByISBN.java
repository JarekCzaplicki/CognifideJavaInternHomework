package json;

import model.BookByISBN;
import model.Books;
import model.IndustryIdentifier;
import model.Item;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Jarek Czaplicki
 */
public class CreateBookByISBN {
    public static BookByISBN bookByISBN(Books books, String isbn) {
        BookByISBN bookByISBN = new BookByISBN();

        for (Item item : books.getItems()) {
            for (IndustryIdentifier industryIdentifier : item.getVolumeInfo().getIndustryIdentifiers()) {
                System.out.println(industryIdentifier.getIdentifier().equals(isbn));
                System.out.println(item.getID().equals(isbn));
                System.out.println(isbn);
                System.out.println(industryIdentifier.getIdentifier());
                System.out.println(item.getID());
                if (industryIdentifier.getIdentifier().equals(isbn) || item.getID().equals(isbn)) {
                    bookByISBN.setIsbn(isbn);
                    bookByISBN.setTitle(item.getVolumeInfo().getTitle());
                    bookByISBN.setSubtitle(item.getVolumeInfo().getSubtitle());
                    if (item.getVolumeInfo().getPublisher() != null)
                        bookByISBN.setPublisher(item.getVolumeInfo().getPublisher());
                    if (item.getVolumeInfo().getPublishedDate() != null)
                        bookByISBN.setPublishedDate(Converters.dateToEpoh(item.getVolumeInfo().getPublishedDate()));
                    if (item.getVolumeInfo().getDescription() != null)
                        bookByISBN.setDescription(item.getVolumeInfo().getDescription().substring(0, (item.getVolumeInfo().getDescription().indexOf(".") + 1)));
                    bookByISBN.setPageCount(item.getVolumeInfo().getPageCount());
                    bookByISBN.setThumbnailUrl(item.getVolumeInfo().getImageLinks().getThumbnail());
                    bookByISBN.setLanguage(item.getVolumeInfo().getLanguage());
                    bookByISBN.setPreviewLink(item.getVolumeInfo().getPreviewLink());
                    bookByISBN.setAverageRating(item.getVolumeInfo().getAverageRating());
                    if (item.getVolumeInfo().getAuthors() != null)
                        bookByISBN.setAuthors(item.getVolumeInfo().getAuthors());
                    if (item.getVolumeInfo().getCategories() != null)
                        bookByISBN.setCategories(item.getVolumeInfo().getCategories());
//                    System.out.println(bookByISBN);
                    //Converters.stringToJSON(bookByISBN);
                }
            }
        }
        if (bookByISBN.getIsbn() == null) return null;
        else return bookByISBN;
    }
}