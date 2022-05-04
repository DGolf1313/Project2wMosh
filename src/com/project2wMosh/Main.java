package com.project2wMosh;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("What is your favorite food?");
        String food = scanner.nextLine();

        if (food.equals("hamburgers")){
            System.out.println("I couldn't agree more, you win, I wish you were the president!");
        }
        else if (food.equals("pizza")) {
            System.out.println("my favorite is hamburgers, wouldn't you prefer one those right now?");
            String yesNo = scanner.nextLine();
            if (yesNo.equals("yes"))
                System.out.println("About time!");
            else System.out.println("Well, it's about time you changed your mind!");
        }
         else if (food.equals("salad")){
            System.out.println("hamburgers are the salad of a true man. Be a man! Right...?");
            String yesNo = scanner.nextLine();
            if (yesNo.equals("yes"))
                System.out.println("GREAT");
            else System.out.println("BOOOO");
        }
         else {
            System.out.println("Gross, don't you agree, hamburgers are so much better?!");
            String yesNo = scanner.nextLine();
            if (yesNo.equals("yes"))
                System.out.println("GREAT, thank you for thinking better");
            else System.out.println("I'm sorry you are so wrong");
        }



    }
}
