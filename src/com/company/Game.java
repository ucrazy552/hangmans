package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {

    Scanner myobj = new Scanner(System.in);
    boolean getWin = false;
    int lives = 0;

    //string van woorden maken



    public static String getRand(String words[]){
        Random rand = new Random();
        int res = rand.nextInt(words.length);
        String random = (words[res]);

        return random;
    }




    public void input(String goedeWoord) {
        //maken van scanner object
        System.out.println("Put in your letter:");
        //pakken van user input met char
        char userInput = myobj.next().charAt(0);


        //maken van char array
        char[] charWoord = new char[goedeWoord.length()];

        //plaatsen in array
        for (int i = 0; i < goedeWoord.length(); i++){
            charWoord[i] = goedeWoord.charAt(i);
        }

        for (char c : charWoord) {
            System.out.printf("_");
        }




        if (true){
            this.getWin = true;
            System.out.println("WINNER!");
            System.exit(0);
        } else {
            lives++;
            System.out.println("FOUTEN = " + lives);
            if (lives == 5){
                System.out.println("YOU LOST THE GAME!\nThe Word Was:");
                System.out.println(goedeWoord);
                System.exit(0);
            }
        }
        input(goedeWoord);

    }


}
