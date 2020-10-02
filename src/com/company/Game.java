package com.company;

import java.util.Random;
import java.util.Scanner;

public class Game {

    //string van woorden maken
    public static String[] words = {"Mercedes ", "Ferrari", "RedBull", "Renault", "HAAS", "AlfaRomeo"};

    public static int randString(){
        Random rand = new Random();
        int res = rand.nextInt(words.length);
        return res;
    }


    public void input() {
        //maken van scanner object
        Scanner myobj = new Scanner(System.in);
        System.out.println("Welcome to HangMan!");
        System.out.println(randString());

    }

}
