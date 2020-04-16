import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import models.ScrabbleScore;


public class App1 {
    public static void main(String[] args) {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("I'm a Scrabble Score  application!");
        System.out.println("Enter a word:");
        try {
            String stringUserWord = bufferedReader.readLine();
            ScrabbleScore scrabble = new ScrabbleScore(stringUserWord);
            int  wordPoint = scrabble.getScore();
            System.out.println(" The word " + stringUserWord + " : " + " is equal to " + wordPoint + " points");

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
