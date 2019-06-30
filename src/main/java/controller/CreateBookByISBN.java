package controller;

import model.BookByISBN;
import model.Books;
import model.IndustryIdentifier;
import model.Item;

/**
 * @author Jarek Czaplicki
 */
public class CreateBookByISBN {
    /**
     * Returns a book identified by the given ISBN number
     *
     * @param books object containing the input json file
     * @param isbn given ISBN number
     * @return returns the book assigned to the specified isbn, or returns error 400
     */
    public static BookByISBN bookByISBN(Books books, String isbn) {
        BookByISBN bookByISBN = new BookByISBN();

        for (Item item : books.getItems()) {
            for (IndustryIdentifier industryIdentifier: item.getVolumeInfo().getIndustryIdentifiers()) {
                if(industryIdentifier.getIdentifier().equals(isbn) || item.getID().equals(isbn)){
                    bookByISBN.setIsbn(isbn);
                    if(item.getVolumeInfo().getTitle() != null)
                        bookByISBN.setTitle(item.getVolumeInfo().getTitle());
                    if (item.getVolumeInfo().getSubtitle() != null)
                        bookByISBN.setSubtitle(item.getVolumeInfo().getSubtitle());
                    if (item.getVolumeInfo().getPublisher() != null)
                        bookByISBN.setPublisher(item.getVolumeInfo().getPublisher());
                    if (item.getVolumeInfo().getPublishedDate() != null)
                        bookByISBN.setPublishedDate(DateToEpoch.dateToEpoh(item.getVolumeInfo().getPublishedDate()));
                    if (item.getVolumeInfo().getDescription() != null)
                        bookByISBN.setDescription(item.getVolumeInfo().getDescription().substring(0,(item.getVolumeInfo().getDescription().indexOf(".")+1)));
                    if (item.getVolumeInfo().getPageCount() != null)
                        bookByISBN.setPageCount(item.getVolumeInfo().getPageCount());
                    if (item.getVolumeInfo().getImageLinks().getThumbnail() != null)
                        bookByISBN.setThumbnailUrl(item.getVolumeInfo().getImageLinks().getThumbnail());
                    if (item.getVolumeInfo().getLanguage() != null)
                        bookByISBN.setLanguage(item.getVolumeInfo().getLanguage());
                    if (item.getVolumeInfo().getPreviewLink() != null)
                        bookByISBN.setPreviewLink(item.getVolumeInfo().getPreviewLink());
                    if (item.getVolumeInfo().getAverageRating() != null)
                         bookByISBN.setAverageRating(item.getVolumeInfo().getAverageRating());
                    if (item.getVolumeInfo().getAuthors() != null)
                        bookByISBN.setAuthors(item.getVolumeInfo().getAuthors());
                    if (item.getVolumeInfo().getCategories() != null)
                        bookByISBN.setCategories(item.getVolumeInfo().getCategories());
                }
            }
        }
        if(bookByISBN.getIsbn() == null) return null;
        else return bookByISBN;
    }
}
