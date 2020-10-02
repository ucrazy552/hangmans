package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {
    boolean inGame = false;
    //string van woorden maken
    public static String[] words = {"Mercedes ", "Ferrari", "RedBull", "Renault", "HAAS", "AlfaRomeo"};


    public static String getRandom(String[] array) {
        int rnd = (int)(Math.random()*array.length);
        return array[rnd];
    }

    public void displayWord() {
        System.out.println(getRandom(words));
    }

    public void input() {
        //maken van scanner object
        Scanner myobj = new Scanner(System.in);
        System.out.println("Welcome to HangMan!");
        displayWord();

    }

}
