import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws InsufficientBalanceException {
        Scanner scanner = new Scanner(System.in);
        String command = " ";
        double money = 0;
        BankAccount bankAccount = new BankAccount();

        System.out.println("Welcome to Soylu Bank!");
        System.out.println("1.Deposit");
        System.out.println("2.Withdraw");
        System.out.println("3.See Balance");
        System.out.println("4.Exit");

        while(!command.equals("4")){
            System.out.print("What is your choice? (1,2,3,4): ");
            command = scanner.nextLine();

            switch (command) {
                case "1":
                    try{
                        System.out.print("How much do you want to deposit?: ");
                        money = scanner.nextDouble();
                        try{
                            bankAccount.deposit(money);
                        }
                        catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid number");
                    }
                    break;
                case "2":
                    try{
                        System.out.print("How much do you want to withdraw?: ");
                        money = scanner.nextDouble();
                        try{
                            bankAccount.withdraw(money);
                        }
                        catch(InsufficientBalanceException e){
                            System.out.println("Insufficient Balance");
                        }
                        catch (IllegalArgumentException e){
                            System.out.println(e.getMessage());
                        }
                    }
                    catch (InputMismatchException e){
                        System.out.println("Please enter a valid number");
                    }
                    break;
                case "3":
                    System.out.print("Your balance is " + bankAccount.getBalance());
                    break;
                case "4":
                    System.out.print("Thanks for preferring us 😍");
                    break;
                default:
                    System.out.print("Invalid command");
                    break;
            }
            scanner.nextLine();
        }
        scanner.close();
    }
}