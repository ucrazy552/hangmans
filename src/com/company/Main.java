package com.company;

public class Main {

    public static void main(String[] args) {

        //Poppetje pop = new Poppetje();
        //pop.lol();
        lol();
    }
    //string array vullen met woorden
    public static String[] words = {"Mercedes", "Ferrari", "RedBull", "Renault", "HAAS", "AlfaRomeo"};

    //functie maken die andere class aanroept en een woord meegeeft
    public static void lol() {
        //maken van game
        Game maker = new Game();
        //functie aanroepen die random woord uit words geeft
        String goedeWoord = maker.getRand(words);
        System.out.println("Welcome to HangMan!\nYou got 5 chances\n");
        //goedewoord meegeven aan de andere class functie
        maker.input(goedeWoord);
        //maker.printDash();
    }


}
