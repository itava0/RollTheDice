package com.pluralsight;

public class Main {
    public static void main(String[] args) {
        Dice dice = new Dice();

        int roll1;
        int roll2;

        int counter2 = 0;
        int counter4 = 0;
        int counter6 = 0;
        int counter7 = 0;
        int sum;

        for (int i = 0; i < 100; i++) {

            roll1 = dice.roll();
            roll2 = dice.roll();
            sum = roll1 + roll2;

            switch (sum) {
                case 2 -> counter2++;
                case 4 -> counter4++;
                case 6 -> counter6++;
                case 7 -> counter7++;
            }

            System.out.print("Roll " + i + ":  " + roll1 + "  - " + roll2 + "  Sum: " + sum + "  \n");

        }

        System.out.println("sums of two's: " + counter2);
        System.out.println("sums of four's: " + counter4);
        System.out.println("sums of six's: " + counter6);
        System.out.println("sums of seven's: " + counter7);

        }
}
