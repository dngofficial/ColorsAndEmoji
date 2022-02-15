public class Ratio {
    public static void main(String[] args) {


        // constants: these are "unicode" characters that
        // each represent a color!
         final String BLUE = "\u001B[36m";
         final String RED = "\u001B[31m";
         final String BROWN = "\u001B[33m";
         final String WHITE = "\u001B[37m";
         final String BLACK = "\u001B[30m";
         final String CYAN = "\033[0;34m";
         final String BLUE_BRIGHT = "\033[0;94m";
         final String PURPLE = "\033[0;35m";
         final String GREEN = "\033[0;32m";

        // emoji example (unicode)

        // instance variable

        // constructor


            System.out.println(BLACK + "Hello, " + BLUE_BRIGHT + "I don't like your opinion and so " + BROWN + "I will ratio you on java.");
            System.out.println(BLUE + "But how will this work, you ask?" + PURPLE + " Well if I get more unicode up arrows, then down unicode arrows...");
            System.out.println(GREEN + "I will have successfully ratioed you.");

            System.out.println("");



            // search for emoji icons here:  https://www.fileformat.info/info/unicode/char/search.htm
            // when you find one you like, scroll down to "C/C++/Java source code" and copy/paste that string
            System.out.println(BLACK + "[Your opinion]");
            System.out.println(GREEN + "GG:" + GREEN + "\u21E7" + "783   " + RED + "RIP BOZO L: " + "\u21E9" + "705");
            System.out.println(PURPLE + "Successfully ratioed you! yay!");

    }
}
