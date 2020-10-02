package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    boolean inGame = false;
    //string van woorden maken
    public static String[] words = {"Mercedes ", "Ferrari", "RedBull", "Renault", "HAAS", "AlfaRomeo"};


    public static String getRand(String words[]){
        Random rand = new Random();
        int res = rand.nextInt(words.length);
        return words[res];
    }


    public void input() {
        //maken van scanner object
        Scanner myobj = new Scanner(System.in);
        System.out.println("Welcome to HangMan!");
        System.out.println(getRand(words));

    }

}
