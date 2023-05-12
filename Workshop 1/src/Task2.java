/**********************************************
Workshop 1
Course: JAC444 - 4
Last Name: Saiyed
First Name: Mohammad Maaz Saiyed
ID: 113485205
Section: ZAA
This assignment represents my own work in accordance with Seneca Academic Policy.
Signature
Date: 01-02-2023
**********************************************/

import java.util.Random;
import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Press enter to roll the dice!");
        scan.nextLine();
        int dice1 = (int)(Math.random() * 6 + 1);
        int dice2 = (int)(Math.random() * 6 + 1);
        int sum = dice1 + dice2;
        int point;
        System.out.println("You rolled " + dice1 + " + "+dice2 + " = " + sum);
        if(sum == 2 || sum == 3 || sum == 12){
            System.out.println("Craps, Better Luck Next Time, You lose");
        }
        else if(sum == 7 || sum == 11){
        	
            System.out.println("Congratulations, You win");
        }
        else{
            point = sum;
            System.out.println("Point is (established) set to " + point);
            sum = 0;
            while(sum != point && sum != 7){
                System.out.println("Press enter to roll the dice!");
                scan.nextLine();
                dice1 = (int)(Math.random() * 6 + 1);
                dice2 = (int)(Math.random() * 6 + 1);
                sum = dice1 + dice2;
                System.out.println("You rolled " + dice1 + " + "+dice2 + " = " + sum);
                if(sum == point){
                    System.out.println("Congratulations, You Win");
                }
                else if (sum == 7){
                    System.out.println("Craps, Better Luck Next Time, You lose");
                }
            }
        }
    }
}
