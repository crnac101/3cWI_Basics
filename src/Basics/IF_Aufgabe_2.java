package Basics;

import java.util.Random;

public class IF_Aufgabe_2 {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = random.nextInt(100);
        System.out.println(randomNumber);

        Random random2 = new Random();
        int randomNumber2 = random.nextInt(100);
        System.out.println(randomNumber2);

        // Wenn die erste Zahl kleiner ist als die zweite UND die erste Zahl kleiner ist als 50 */

        if (randomNumber<randomNumber2 && randomNumber<50) {
            System.out.println("Zahl 1 ist kleiner als Zahl 2 und Mini");
        }

        // Wenn die erste Zahl kleiner ist als 30 oder die zweite Zahl kleiner ist als 30

        if(randomNumber<30 || randomNumber2<30) {
            System.out.println("Eine der beiden Zahlen ist kleiner als 30");
        }

        // Wenn die erste Zahl kleiner ist als 50 UND die zweite Zahl ungleich 50 ist
        if (randomNumber>50 && randomNumber2 !=50) {
            System.out.println("Erste Zahl klein, Zweite keine 50");
        }






    }
}
