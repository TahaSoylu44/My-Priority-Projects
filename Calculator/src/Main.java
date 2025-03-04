import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double num1 = myscanner.nextDouble();

        System.out.print("Enter the operator (+,-,/,*,^) : ");
        char operator = myscanner.next().charAt(0);

        System.out.print("Enter the second number: ");
        double num2 = myscanner.nextDouble();

        myscanner.close();

        switch(operator){
            case '+' -> System.out.println("The result is " + (num1 + num2));
            case '-' -> System.out.println("The result is " + (num1 - num2));
            case '*' -> System.out.println("The result is " + (num1 * num2));
            case '/' -> {
                if (num2 == 0){
                    System.out.println("You cannot divide by zero 😒");
                }
                else{
                    System.out.println("The result is " + (num1/num2));
                }
            }
            case '^' -> {
                if (num1 == 0 && num2 == 0){
                    System.out.println("Undefined");
                }
                else{
                    System.out.println("The result is " + (Math.pow(num1,num2)));
                }
            }
            default -> System.out.println("You may enter an invalid operator 🤔");
        }
    }
}