package Lesson1_Hws.Numberguessgame;

import java.util.Random;
import java.util.Scanner;
import java.util.Arrays;

public class Main{
    public static void main(String[] args) {
        int truenum=0,attempts=0;
        String name = null;
        Scanner scanner=new Scanner(System.in);
        System.out.println("enter your name");
        name=scanner.nextLine();
        int[] guessednumbers = new int[100];
        while (true){
            if (attempts==0){
                System.out.println("Let the show begin!");
                Random rand = new Random();
                truenum = rand.nextInt(100);
            }
            System.out.println("make a guess");
            int guess=scanner.nextInt();
            scanner.nextLine();
            attempts++;
            guessednumbers[attempts-1] = guess;
            if (guess==truenum){
                System.out.printf("Congratulations, %s!", name);
                System.out.println();
                System.out.println("Your numbers: ");
                Arrays.sort(guessednumbers, 0, attempts);
                for (int i = attempts - 1; i >= 0; i--) {
                    System.out.print(guessednumbers[i] + " ");
                }
                System.out.println();
                Arrays.fill(guessednumbers, 0);
                attempts=0;
            }
            else if (guess<truenum){
                System.out.println("Your number is too small. Please, try again.");
            }
            else{
                System.out.println("Your number is too big. Please, try again.");
            }
        }
    }
}