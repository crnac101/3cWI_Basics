package Basics;

import java.util.Random;

public class Switch_Statements {
    public static void main(String[] args) {

        Random random = new Random();
        int randomNumber = 5 + random.nextInt(10-5+1);
        System.out.println(randomNumber);

        switch (randomNumber){

            case 5:
                System.out.println("five");
                break;

            case 6:
                System.out.println("six");
                break;

            case 7:
                System.out.println("seven");
                break;

            case 8:
                System.out.println("eight");
                break;

            case 9:
                System.out.println("nine");
                break;

            case 10:
                System.out.println("ten");
                break;
        }












    }





}
