import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner myscanner = new Scanner(System.in);

        int row,column;
        char userChar;

        System.out.print("Please enter the number of rows: ");
        row = myscanner.nextInt();

        System.out.print("Please enter the number of columns: ");
        column = myscanner.nextInt();

        System.out.print("What symbol do you want?: ");
        userChar = myscanner.next().charAt(0);

        for(int i = 1; i <= row; i++){
            for(int j = 1; j <= column; j++){
                System.out.print(userChar);
            }
            System.out.println();
        }

        myscanner.close();
    }
}