package models;

import org.junit.*;
import static org.junit.Assert.*;


public class ScrabbleScoreTest {


    @Test
    public void getScore_testALowerCaseLetter_1() {
        ScrabbleScore scrabble = new ScrabbleScore("a");
        assertEquals(1, scrabble.getScore());
    }

    @Test
    public void getScore_testAUpperCaseLetter_1() {
        ScrabbleScore scrabble = new ScrabbleScore("A");
        assertEquals(1, scrabble.getScore());
    }

    @Test
    public void getScore_testAValuableLetter_4() {
        ScrabbleScore scrabble = new ScrabbleScore("f");
        assertEquals(4, scrabble.getScore());
    }

    @Test
    public void getScore_testAShortWord_2() {
        ScrabbleScore scrabble = new ScrabbleScore("at");
        assertEquals(2, scrabble.getScore());
    }

    @Test
    public void getScore_testAShortValuableWord_12() {
        ScrabbleScore scrabble = new ScrabbleScore("zoo");
        assertEquals(12, scrabble.getScore());
    }


    @Test
    public void getScore_testAMediumWord_6() {
        ScrabbleScore scrabble = new ScrabbleScore("street");
        assertEquals(6, scrabble.getScore());
    }


    @Test
    public void getScore_testAMediumValuableWord_22() {
        ScrabbleScore scrabble = new ScrabbleScore("quirky");
        assertEquals(22, scrabble.getScore());
    }

    @Test
    public void getScore_testALongMixCaseWord_41() {
        ScrabbleScore scrabble = new ScrabbleScore("OxyphenButazone");
        assertEquals(41, scrabble.getScore());
    }

    @Test
    public void getScore_testAEnglishLikeWord_8() {
        ScrabbleScore scrabble = new ScrabbleScore("pinata");
        assertEquals(8, scrabble.getScore());
    }


         @Test
       public void getScore_testAnEmptyInput_0() {
              ScrabbleScore scrabble = new ScrabbleScore("");
               assertEquals(0, scrabble.getScore());
        }


        @Test
       public void getScore_testEntireAlphabetAvailable_87() {
                ScrabbleScore scrabble = new ScrabbleScore("abcdefghijklmnopqrstuvwxyz");
               assertEquals(87, scrabble.getScore());
       }
}


