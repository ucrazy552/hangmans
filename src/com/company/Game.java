package com.company;


import java.util.Random;
import java.util.Scanner;

public class Game {

    //maken van scanner object
    Scanner myobj = new Scanner(System.in);

    //levens bij houden mag 5 keer
    int lives = 0;

    //lege string vullen met alle char van geven user
    private String allUserInput = "";


    //random woord uit string array geven
    public static String getRand(String words[]) {
        Random rand = new Random();
        int res = rand.nextInt(words.length);
        String random = (words[res]);
        return random;
    }

    //controleren
    public void input(String goedeWoord) {

        //maken van char array
        char[] charWoord = new char[goedeWoord.length()];

        //plaatsen van goede woord in array
        for (int i = 0; i < goedeWoord.length(); i++) {
            charWoord[i] = goedeWoord.charAt(i);
        }

        //blijf dit 5 keer vragen daarna ben je dood
        while (lives <= 5) {

            System.out.println("Put in your letter:");

            //pakken van user input met char
            char userInput = myobj.next().charAt(0);

            //alle char input van user in String array stoppen
            allUserInput = allUserInput + userInput;

            //als goedewoord niet gelijk is door user ingevoerd
            if (goedeWoord.indexOf(userInput) == -1) {
                lives++;
            }

            boolean gewonnen = true;

            //printen van lijnen
            for (char c : charWoord) {

                //als alles van userinput String over een komt met dat print het goede letter uit de string array
                if (allUserInput.indexOf(c) > -1) {
                    System.out.printf(c + " ");
                } else {
                    //anders print alleen een streep en zet gewonnen op false
                    System.out.printf("_ ");
                    gewonnen = false;
                }
            }


            //kijken van win of lose
            if (gewonnen) {
                //this.getWin = true;
                System.out.println("WINNER!");
                System.exit(0);
            } else {
                //lives++;
                //laten zien van resterende levens
                System.out.println("FOUTEN = " + lives);
                if (lives == 5) {
                    //als meer dan vijf fouten sluit spel af
                    System.out.println("YOU LOST THE GAME!\nThe Word Was:");
                    System.out.println(goedeWoord);
                    System.exit(0);
                }
            }
        }
        input(goedeWoord);

    }


}