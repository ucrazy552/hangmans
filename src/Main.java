public class Main {

    public static void main(String[] args) {

        //Roep lol method aan die is static dus hoeft geen object van te maken
        //lol();
        //maken van game object
        Game maker = new Game();
        String[] words = {"Mercedes", "Ferrari", "RedBull", "Alpine", "HAAS", "AlfaRomeo", "Mclaren"};
        System.out.println("Welcome to HangMan!\nYou got 5 tries");
        System.out.println("Guess the Formula one Team!\n");
        //Stop random wordt uit words in String
        String randomWord = maker.getRand(words);

        //goedewoord meegeven aan de andere class functie
        maker.input(randomWord);
        //maker.printDash();

    }

    //string array vullen met woorden

    //functie maken die andere class aanroept en een woord meegeeft
//    public static void lol() {
//        //maken van game object
//        Game maker = new Game();
//        //Stop random wordt uit words in String
//        String randomWord = maker.getRand(words);
//        System.out.println("Welcome to HangMan!\nYou got 5 tries");
//        System.out.println("Guess the Formula one Team!\n");
//
//        //goedewoord meegeven aan de andere class functie
//        maker.input(randomWord);
//        //maker.printDash();
//    }


}
