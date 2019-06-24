package json;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonReader;
import model.Books;

import java.io.FileReader;
import java.io.IOException;

/**
 * @author Jarek Czaplicki
 */
public class ReadJSON {

    public static Books readJSON(){
        Gson gson = new GsonBuilder().create();
        Books books = new Books();
        try {
            books = gson.fromJson(new JsonReader(new FileReader("books.json")), Books.class);
        } catch (IOException e){
            e.printStackTrace();
        }
        return books;
    }
}
