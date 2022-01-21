//Gebruiken van java packages

import java.util.Random;
import java.util.Scanner;

//Game object class
public class Game {

    //maken van scanner object
    Scanner myobj = new Scanner(System.in);

    //integer die gelijk staat aan nul
    int lives = 0;

    //lege string vullen met alle char van geven user
    private String allUserInput = "";

    //getRand Method
    //random woord uit string array geven
    public String getRand(String words[]) {
        //gebruik java package random
        Random rand = new Random();

        int res = rand.nextInt(words.length);
        String random = (words[res]);
        //geef random woord terug
        return random;
    }

    //controleren input Method
    public void input(String goedeWoord) {

        // maak char array met lengte van het woord
        char[] charWoord = new char[goedeWoord.length()];
        //Plaats dat woord letter voor letter in char array
        for (int i = 0; i < goedeWoord.length(); i++) {
            charWoord[i] = goedeWoord.charAt(i);
        }

        //Blijf herhalen tot lives gelijk is aan 5
        while (lives <= 5) {

            System.out.println("Put in your letter:");

            //pakken van user input met char uit index 0
            char userInput = myobj.next().charAt(0);

            //alle char input van user in String array stoppen
            allUserInput = allUserInput + userInput;

            //als goedewoord niet gelijk is door user ingevoerd
            if (goedeWoord.indexOf(userInput) == -1) {
                lives++;
            }

            boolean gewonnen = true;

            //Print lijnen met lengte van charWoord
            for (char c : charWoord) {
                //pak index van de goede letter uit char array
                if (allUserInput.indexOf(c) > -1) {
                    //als letter correct is print deze op scherm
                    System.out.printf(c + " ");
                } else {
                    //print lengte van woord met een streep
                    System.out.printf("_");
                    gewonnen = false;
                }
            }


            //kijken van win of lose
            //als gewonnen == true
            if (gewonnen) {
                System.out.println(" WINNER!");
                System.exit(0);
            } else {
                //lives++;
                //laten zien van resterende levens
                System.out.println(" FOUTEN = " + lives);
                if (lives == 5) {
                    //als meer dan vijf fouten sluit spel af
                    System.out.println("YOU LOST THE GAME!\nThe Word Was:");
                    System.out.println(goedeWoord);
                    System.exit(0);
                }
            }
        }
        // Roep functie opnieuw aan
        //input(goedeWoord);

    }


}