package com.company;

public class Main {

    public static void main(String[] args) {

        Poppetje pop = new Poppetje();
        pop.lol();
        lol();



    }
    public static String[] words = {"Mercedes", "Ferrari", "RedBull", "Renault", "HAAS", "AlfaRomeo"};



    public static  void lol() {

        Game maker = new Game();
        String goedeWoord = maker.getRand(words);
        System.out.println(goedeWoord);
        System.out.println("Welcome to HangMan!\nYou got 5 chances\n");
        maker.input(goedeWoord);
        //maker.printDash();
    }


}
