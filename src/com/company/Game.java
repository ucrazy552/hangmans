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
        String userInput = myobj.nextLine();
        //char[] charArray = {goedeWoord.charAt(goedeWoord.length())};
        //System.out.println(charArray);

        if (userInput.equals(goedeWoord)){
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
