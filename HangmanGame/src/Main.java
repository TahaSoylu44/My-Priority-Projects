import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] fruits = {
                "Apple",
                "Banana",
                "Orange",
                "Mango",
                "Grapes",
                "Pineapple",
                "Strawberry",
                "Cherry",
                "Watermelon",
                "Peach"
        };

        Scanner scanner = new Scanner(System.in);
        char answer = 'y';

        while (answer == 'y') {
            Random random = new Random();
            int index = random.nextInt(10);

            String chosen = fruits[index];

            String word = chosen.toLowerCase();

            Character[] charList = new Character[word.length()];

            for (int i = 0; i < word.length(); i++) {
                charList[i] = '_';
            }

            int wrongGuesses = 0;
            char guess;
            boolean isFound = false;

            System.out.println("*****************************");
            System.out.println("Welcome to Java Hangman Fruit Game!");
            System.out.println("*****************************");

            while (wrongGuesses < 6) {
                boolean isLetter = true;
                System.out.println("Hangman situation: ");
                hangMan(wrongGuesses);
                System.out.println("*****************************");
                printUserWord(charList);
                System.out.print("\nEnter your guess: ");
                guess = scanner.next().charAt(0);

                for (char c : charList) {
                    if (c == guess) {
                        System.out.println("You have already said that!");
                        isLetter = false;
                        break;
                    }
                }

                if (isLetter) {
                    if (word.indexOf(guess) >= 0) {
                        isFound = true;
                        for (int j =0; j < word.length(); j++) {
                            if (word.charAt(j) == guess) {
                                charList[j] = guess;
                            }
                        }
                        for (char ch : charList) {
                            if (ch == '_') {
                                isFound = false;
                                break;
                            }
                        }
                        if (isFound) {
                            System.out.println();
                            System.out.println("You win!");
                            System.out.println("The word was: " + word);
                            System.out.println("The last hangman situation :");
                            hangMan(wrongGuesses);
                            break;
                        }
                        else {
                            System.out.println("You guessed!");
                        }
                    }
                    else {
                        wrongGuesses++;
                        System.out.println("Wrong letter :(");
                    }
                }
            }
            if (!isFound){
                System.out.println("You lost!");
                System.out.println("The word was: " + word);
                System.out.println("The last hangman situation :");
                hangMan(wrongGuesses);
            }
            System.out.println("Thank you for playing!");
            System.out.println("Do you want to play again? (Y/N)");
            answer = scanner.next().toLowerCase().charAt(0);
        }
        if (answer == 'n') {
            System.out.println("Goodbye!");
        }
    }

    public static void printUserWord(Character[] charList) {
        System.out.print("Word: ");
        for (char c : charList) {
            System.out.print(c + " ");
        }
    }
    public static void hangMan(int wrongGuesses){
        switch(wrongGuesses){
            case 0:
                System.out.println("No action");
                break;
            case 1:
                System.out.println("\nO\n\n\n");
                break;
            case 2:
                System.out.println("\nO\n|\n\n");
                break;
            case 3:
                System.out.println("\n O\n/|\n\n");
                break;
            case 4:
                System.out.println("\n O\n/|\\\n\n");
                break;
            case 5:
                System.out.println("\n O\n/|\\\n/\n");
                break;
            case 6:
                System.out.println("\n O\n/|\\\n/ \\\n");
                break;
        }
    }
}