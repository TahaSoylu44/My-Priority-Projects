import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        Scanner user = new Scanner(System.in);

        ArrayList<Character> answers = new ArrayList<>();  //User input

        char[] option_alp = {'A','B','C','D'};  //Default Options to print

        int counter = 0; //Number of Correct Answers.

        String[] questions = {
                "What is the capital of France?",
                "What is 7 X 8?",
                "Who wrote Harry Potter?",
                "What is the chemical symbol for gold?",
                "Which planet is known as the \"Red Planet\"?",
                "Who painted the Mona Lisa?",
                "What is the square root of 289?",
                "Who developed the theory of relativity?",
                "In what year did the Titanic sink?"};

        String[][] options = {
                {"Berlin","Madrid","Paris","Rome"},
                {"54","56","64","48"},
                {" J.R.R. Tolkien","J.K. Rowling","Stephen King"," Agatha Christie"},
                {"Go","Au","Ag","Hg"},
                {"Venus","Mars","Jupiter","Mercury"},
                {"Michelangelo","Vincent van Gogh","Leonardo da Vinci","Pablo Picasso"},
                {"15","16","17","18"},
                {"Isaac Newton","Galileo Galilei","Albert Einstein","Nikola Tesla"},
                {"1910","1912","1915","1920"}};

        for(int i = 0;i < questions.length;i++){
            System.out.println(questions[i]);
            for (int j = 0;j < 4; j++){
                System.out.println(option_alp[j] + ")" + " " + options[i][j]);
            }

            boolean isOption = false;

            do{
                System.out.print("Please enter your answer (A/B/C/D): ");
                char answer = user.next().charAt(0);

                for (char option : option_alp){
                    if (option == answer){
                        isOption = true;
                        answers.add(answer);
                        break;
                    }
                }
            }while (!isOption);
            System.out.println();
        }

        char[] correctAnswers = {'C','B','B','B','B','C','C','C','B'};

        System.out.println("REVIEWS");

        for (int i = 0; i < correctAnswers.length; i++){
            if(answers.get(i) == correctAnswers[i]){
                counter += 1;
                System.out.printf("Question %d is true :D,well done!\n", (i+1));
            }
            else{
                System.out.printf("Question %d is false D:.It should have been %c but you said %c.Try to resolve it :)\n", (i+1), correctAnswers[i], answers.get(i));
            }
        }
        System.out.println("\nYou did " + counter + " out of " + questions.length + " questions.");
        System.out.print("Thx for playing.Press q to quit: ");
        char quit = user.next().charAt(0);
        System.out.print("\nYou left the game.");

        user.close();
    }
}