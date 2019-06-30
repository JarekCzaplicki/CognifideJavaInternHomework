package controller;

import java.text.ParseException;
import java.text.SimpleDateFormat;
public class DateToEpoch {

  /**
   * Converts date to Epoch format
   *
   * @param strDate
   * @return Date in milliseconds since the 1970s
   */

  public static Long dateToEpoh(String strDate) {

    strDate = strDate.replace("-","/");
    Long millis = 0L;
    if (strDate.length() == 4)
      strDate +="/01/01/01";
    if (strDate.length() == 10)
      strDate +="/00";

    try {
      millis = new SimpleDateFormat("yyyy/MM/dd/HH").parse(strDate).getTime();
    } catch (ParseException e) {
      e.printStackTrace();
    }
    return millis;
  }
}
