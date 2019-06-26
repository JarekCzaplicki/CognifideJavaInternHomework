package tool;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
public class StringToJSON {
  public static void stringToJSON(Object dataString){
    Gson gson = new Gson();
    String json = gson.toJson(dataString);
    System.out.println(json);
    try {
      FileWriter writer = new FileWriter("BookByISBN.json");
      writer.write(json);
      writer.close();
    } catch (IOException e) {
      e.printStackTrace();
    }

  }

}
