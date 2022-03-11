package Projects;

import java.util.Random;
import java.util.Scanner;

public class Würfelspeil {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.nextInt();


        Random random = new Random();
        int randomNumber = random.nextInt(6);
        System.out.println("gewürfelteZahl des Computers: " + randomNumber);

        Random random2 = new Random();
        int randomNumber2 = random.nextInt(6);
        System.out.println("deine gewürfelte Zahl: " + randomNumber2);


        if (randomNumber > randomNumber2) {
            System.out.println("du hast verloren");
        } else if (randomNumber == randomNumber2) {
            System.out.println("gleichstand brate");
        } else System.out.println("du hast gewonnen");


    }
}
