package controller;

import com.google.gson.Gson;

import java.io.FileWriter;
import java.io.IOException;

public class StringToJSON {

  /**
   * An auxiliary method to verify the correctness of returned json on endpoints
   *
   * @param dataString
   */
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
