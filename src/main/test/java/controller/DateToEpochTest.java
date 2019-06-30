package controller;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;


/**
 * @author Jarek Czaplicki
 */
class DateToEpochTest {
    @Test
    void dateToEpoch() {
        DateToEpoch tester = new DateToEpoch();
        Assertions.assertAll("Asercje daty",
                ()->assertEquals(java.util.Optional.of(1106866800000L), tester.dateToEpoh("2005-01-28")),
                ()->assertEquals(java.util.Optional.of(1386543600000L), tester.dateToEpoh("2013-12-09")),
                ()->assertEquals(java.util.Optional.of(-3439670400000L), tester.dateToEpoh("1861")));


//        Assertions.assertEquals(java.util.Optional.of(1106866800000L), tester.dateToEpoh("2005-01-28"));
//        Assertions.assertEquals(java.util.Optional.of(1386543600000L), tester.dateToEpoh("2013-12-09"));
//        Assertions.assertEquals(java.util.Optional.of(-3439670400000L), tester.dateToEpoh("1861"));
//        Assertions.assertEquals(java.util.Optional.of(1106866800000L), tester.dateToEpoh("2005-01-28"));
//        Assertions.assertEquals(java.util.Optional.of(1106866800000L), tester.dateToEpoh("2005-01-28"));

    }

}