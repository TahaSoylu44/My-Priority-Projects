import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Person> persons = new ArrayList<>();

        System.out.println("##### Welcome to Contact Manager ######");

        System.out.print("Enter the number of people: ");
        int numOfPeople = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numOfPeople; i++) {
            System.out.print("Student or Employee (S/E) :");
            String who = scanner.nextLine();

            switch (who) {
                case "S":
                    System.out.print("What is the name of the student: ");
                    String nameOfStudent = scanner.nextLine();

                    System.out.print("Please enter the student's phone number: ");
                    String phoneOfStudent = scanner.nextLine();

                    System.out.print("Which school is " + nameOfStudent + " studying at?: ");
                    String school = scanner.nextLine();

                    Student student = new Student(nameOfStudent,phoneOfStudent,school);
                    persons.add(student);
                    break;
                case "E":
                    System.out.print("What is the name of the employee: ");
                    String nameOfEmployee = scanner.nextLine();

                    System.out.print("Please enter the employee's phone number: ");
                    String phoneOfEmployee = scanner.nextLine();

                    System.out.print("Which company is " + nameOfEmployee + " working at?: ");
                    String company = scanner.nextLine();

                    Employee employee = new Employee(nameOfEmployee,phoneOfEmployee,company);
                    persons.add(employee);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
        }
        scanner.close();

        System.out.println("--- Contact List ---");
        for (Person person : persons) {
            System.out.print("Name: " + person.getName());
            System.out.print(" | Phone Number: " + person.getPhoneNumber());
            if(person instanceof Student) {
                System.out.print(" | School: " + ((Student)person).getSchoolName());
            }
            else{
                System.out.print(" | Company: " + ((Employee)person).getCompanyName());
            }
            System.out.println();
        }
    }
}