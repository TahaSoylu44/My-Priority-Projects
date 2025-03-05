import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //Today,I am going to make a game -> Predict my number :)

        Random target = new Random();
        Scanner input = new Scanner(System.in);

        int number = target.nextInt(10);

        System.out.print("Enter the number between 0 and 10: ");
        int user = input.nextInt();

        int counter = 0;

        while(number != user){
            if(user > number){
                System.out.println("It is greater than our target,try again 😇");
                System.out.print("Please enter the number: ");
                user = input.nextInt();
            }
            else{
                System.out.println("It is lower than our target,try again 😉");
                System.out.print("Please enter the number: ");
                user = input.nextInt();
            }

            counter += 1;
        }

        System.out.println("You hit the target.Target was " + number);
        System.out.println("You tried it " + counter + " times.");

        input.close();
    }
}