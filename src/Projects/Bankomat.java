package Projects;

import java.util.Scanner;

public class Bankomat {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int selection = 0;
        int Kontostand = 0;

        while (selection != 4) {
            System.out.println("1. Einzahlen");
            System.out.println("2. Abheben");
            System.out.println("3. Kontostand");
            System.out.println("4. Beenden");

            selection = scanner.nextInt();

            if (selection == 1) {
                int einzahlen = 0;
                einzahlen = scanner.nextInt();
                Kontostand = Kontostand + einzahlen;
                System.out.println("Kontostand" + Kontostand);

                if (selection == 2) {
                    int abheben = 0;
                    abheben = scanner.nextInt();
                    Kontostand = Kontostand - abheben;
                    System.out.println("Kontostand" + Kontostand);
                }

                if (selection == 3) {
                    System.out.println("Kontostand" + Kontostand);
                }

                if (selection == 4) {
                    break;
                }

            }

        }


    }
}





















