/**
 * Created by alanmartinez on 2/25/16.
 */

import java.util.Scanner;

public class fizzbuzz {

    public static void main(String[] args){

        int start=0;
        int end=0;
        int fizzCount=0;
        int buzzCount=0;
        int fizzBuzzCount=0;
        int nextNumber=0;
        boolean atEnd=false;


        Scanner scan=new Scanner(System.in);

        System.out.println("FizzBuzz:  This program will process numbers and if they are divisible by 3 a Fizz will " +
                "be output, if they are divisible by 5 a Buzz will be output, and if they are divisibile by both" +
                "3 and 5 a FizzBuzz will be output.\n\n");

        System.out.print("Enter an integer starting point:  ");
        start=scan.nextInt();
        nextNumber=start;

        scan.nextLine();
        System.out.print("\nFor an infinite loop enter -1.  Press ctrl+c to break loop." +
                "\nEnter an integer ending point (enter -1 for an infinite loop):  ");
        end=scan.nextInt();

        do{
            if(nextNumber%3==0&&nextNumber%5==0){
                System.out.println(nextNumber + " Fizz Buzz");
                fizzBuzzCount++;
            }
            else if(nextNumber%3==0){
                System.out.println(nextNumber + " Fizz");
                fizzCount++;
            }
            else if(nextNumber%5==0){
                System.out.println(nextNumber + " Buzz");
                buzzCount++;
            }
            else;

            nextNumber++;

            if(end==-1){
                atEnd=false;}
            else if(nextNumber==end){
                atEnd=true;
            }
        }while(atEnd==false);

        System.out.println("Total Fizz's:  " + fizzCount);
        System.out.println("Total Buzz's:  " + buzzCount);
        System.out.println("Total FizzBuzz's " + fizzBuzzCount);


    }
}
