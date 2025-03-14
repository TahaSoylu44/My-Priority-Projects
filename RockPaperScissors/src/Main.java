import java.util.Scanner;
import java.util.Random;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] choices = {"rock","paper","scissors"};

        boolean isUser = true;
        String userChoice;

        System.out.println("*******************************");
        System.out.println("Welcome to ROCK PAPER SCISSORS!");
        System.out.println("*******************************");

        do{
            System.out.print("What is your choice (rock,paper,scissors) ?: ");
            userChoice = scanner.nextLine();
            for (int i = 0;i < choices.length;i++){
                if(userChoice.toLowerCase().equals(choices[i])){
                    isUser = false;
                    break;
                }
            }
        }while(isUser);

        Random computer = new Random();
        int computerChoice = computer.nextInt(3);

        if(userChoice.toLowerCase().equals("rock")){
            switch(computerChoice){
                case 0:
                    System.out.println("DRAW!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
                case 1:
                    System.out.println("Computer wins!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
                case 2:
                    System.out.println("You win!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
            }
        }
        else if (userChoice.toLowerCase().equals("paper")){
            switch(computerChoice){
                case 0:
                    System.out.println("You win!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
                case 1:
                    System.out.println("DRAW!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
                case 2:
                    System.out.println("Computer wins!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
            }
        }
        else{
            switch(computerChoice){
                case 0:
                    System.out.println("Computer wins!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
                case 1:
                    System.out.println("You win!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
                case 2:
                    System.out.println("DRAW!");
                    System.out.println("Computer choice was " + choices[computerChoice]);
                    break;
            }
        }
        System.out.println("\nThank you for playing.I hope you enjoyed this.");
        System.out.print("Press enter q to quit: ");
        char quit = scanner.nextLine().charAt(0);
        scanner.close();
        System.out.println("You left the game!");
        System.out.println("\nThank you for playing.I hope you enjoyed this.");
    }
}