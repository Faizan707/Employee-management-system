import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        InputHandler inputHandler = new InputHandler(scanner);

        while (true) {
            inputHandler.printOptions();

            String[] choices = {"1", "2", "3", "4", "5"};
            String choice = inputHandler.forceUserCorrectInput(choices);

            switch (choice) {
                case "1":
                    inputHandler.addEmployee();
                    break;
                case "2":
                    inputHandler.addDepartment();
                    break;
                case "3":
                    inputHandler.displayDepartmentsInfo();
                    break;
                case "4":
                    inputHandler.removeEmployee();
                    break;
                case "5":
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }
}
