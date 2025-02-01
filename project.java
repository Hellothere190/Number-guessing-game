import java.util.Random;
import java.util.Scanner;

public class project {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();
        int num = random.nextInt( 25);

        boolean matched = true;
        int score = 12;
        while(matched){
        System.out.println("enter a number ");
        int input =sc.nextInt();
           if(input==num){
               System.out.println(" Congratulation for wasting your time");
               System.out.println("final score;"+score);
               System.out.println("no. of failed attempt");
           } else if (input>num) {
               System.out.println("think harder");
               score--;

               
           }
           else {
               System.out.println("stop thinking and start guessing");
               score--;

           }


        }


    }
}
