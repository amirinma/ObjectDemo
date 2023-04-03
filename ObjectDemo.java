import java.util.Scanner;
import java.util.Random;
import java.io.*;

/**
This program writes random number to a file.
*/

public class ObjectDemo{
   public static void main(String[] args) throws IOException{
   int maxNumbers, number;
      Scanner keyboard = new Scanner(System.in);//creates scanner object for keyboard input
      Random rand = new Random();// creates random object to generate random number
      PrintWriter  outputFile = new PrintWriter("numbers.txt"); // creates a PrintWriter object to open the file
      System.out.print("How many random numbers should I write? "); //get the number of random numbers to write
      maxNumbers = keyboard.nextInt();
      for (int i = 0; i < maxNumbers; i ++){ // write the random number to the file 
         number = rand.nextInt(); //generate a random integer
         outputFile.println(number); //write the random integer to the file
      }
      outputFile.close();
      System.out.println("Done!");
   }
}  