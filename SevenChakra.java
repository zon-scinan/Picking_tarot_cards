package src.main.com.java.ptc;

/*
This is a program of simple using random method from Math class.
And there is also using ZodiacSign1 class.

7 chakra in random

*/
import java.lang.Math;
// PROGRAM START HERE...

// class declaration start here...

public class SevenChakra {

    // main method start here...

    public static void main(String[] args) {
        //SevenChakra sevenChakra = new SevenChakra();
        //sevenChakra.SevenChakraSubMain();

    }

    public void SevenChakraSubMain(){

        // initialization String objects start here...

        String newLine = " is your random number\n\n";
        String text = " your chakra is ";

        String zero = "Root chakra (Red)\nI am the earth ground...\n\n";
        String one = "Sacral chakra (Orange)\nI am water...\n\n";
        String two = "Solar Plexus chakra (Yellow)\nI am flame...\n\n";
        String three = "Heart chakra (Green)\nI am wind...\n\n";
        String four = "Throat chakra (Blue)\nI am the sky...\n\n";
        String five = "Third eye chakra (Indigo)\nI am light...\n\n";
        String six = "Crown chakra (Purple)\nI am universe...\\n\n";

        // initialization String objects end here.

        // using math class's random method
        double randomNumber = Math.random() * 7;
        int singleRandomNumber = (int) randomNumber; // type casting double into int

        // if statement start here...

        if (singleRandomNumber == 0) {
            System.out.println(singleRandomNumber + newLine  + zero);
        } else if (singleRandomNumber == 1) {
            System.out.println(singleRandomNumber + newLine +  one);
        } else if (singleRandomNumber == 2) {
            System.out.println(singleRandomNumber + newLine +   two);
        } else if (singleRandomNumber == 3) {
            System.out.println(singleRandomNumber + newLine +   three);
        } else if (singleRandomNumber == 4) {
            System.out.println(singleRandomNumber + newLine +   four);
        } else if (singleRandomNumber == 5) {
            System.out.println(singleRandomNumber + newLine +  five);
        } else if (singleRandomNumber == 6) {
            System.out.println(singleRandomNumber + newLine +   six);
        }

        // if statement end here

    }
    // main method end here

}
// class declaration end here

// PROGRAM END HERE.

