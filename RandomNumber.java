import java.util.Random;
import java.util.Scanner;
import java.lang.*;
public class RandomNumber 
{
    public static void main(String args[])
    {
        Scanner scan = new Scanner(System.in);
        Random rand = new Random();
        int number = rand.nextInt(100)+1;
       // System.out.println(number);
        
        int count = 0;
        while(true)
        {
            System.out.println("Enter your guess: ");
            int guess = scan.nextInt();
            count++;
            if(guess == number)
            {
                System.out.println("Correct! ");
                System.out.println("u have taken: "+count+" number of chance to guess");
                break;
            }
            else if(guess > number)
            {
                System.out.println("Ur guess is Higher!");
            }
            else {
                System.out.println("Ur guess is lower!");
            }
        }
    }
 
    
}
