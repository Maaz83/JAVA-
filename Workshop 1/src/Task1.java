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

import java.util.Scanner;

public class Task1 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Double arr[][];
        int x,z;
        System.out.print("Enter the number of rows and columns in the array: ");
         x = scan.nextInt();
         z = scan.nextInt();
        System.out.println();
        arr = new Double[x][z];

        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                arr[i][j] = scan.nextDouble();
            }
        }
        Integer loc[] = new Integer[2];
        loc = maxElement(arr);
        System.out.println("The location of the largest element is " + arr[loc[0]][loc[1]].intValue() + " at (" + loc[0] +", " + loc[1]+")");

    }

    static Integer[] maxElement(Double arr[][]){
        Integer location[] = new Integer[2];
        double max = arr[0][0];
        for(int i = 0;i < arr.length;i++){
            for(int j = 0;j < arr[0].length;j++){
                if(arr[i][j] > max){
                    max = arr[i][j];
                    location[0] = i;
                    location[1] = j;

                }
            }
        }
        return location;
    }

}
