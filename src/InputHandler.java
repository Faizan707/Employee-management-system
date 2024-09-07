import java.util.ArrayList;
import java.util.Scanner;

public class InputHandler {
    private final Scanner scanner;
    private final ArrayList<Department> departments;

    public InputHandler(Scanner scanner) {
        this.scanner = scanner;
        this.departments = new ArrayList<>();
    }

    public void printOptions() {
        System.out.println("1. Add employee");
        System.out.println("2. Add department");
        System.out.println("3. Display department and employees");
        System.out.println("4. Remove employee by ID");
        System.out.println("5. Exit");
    }

    public String forceUserCorrectInput(String[] choices) {
        while (true) {
            String input = scanner.nextLine();

            for (String choice : choices) {
                if (input.trim().equals(choice)) {
                    return choice;
                }
            }

            System.out.println("Invalid Option. Please try again.");
        }
    }

    public void displayDepartmentsInfo() {
        for (Department department : departments) {
            department.displayDepartmentInfo();
        }
    }

    public void addEmployee() {
        System.out.println("Enter department name:");
        String deptName = scanner.nextLine();
        Department dept = findDepartment(departments, deptName);

        if (dept == null) {
            System.out.println("Department not found.");
            return;
        }

        System.out.println("Enter employee name:");
        String empName = scanner.nextLine();
        System.out.println("Enter employee salary:");
        double salary = scanner.nextDouble();
        scanner.nextLine();
        dept.addEmployee(new Employee(empName, deptName, salary));
        System.out.println("Employee added.");
    }

    public void removeEmployee() {
        System.out.println("Enter department name:");
        String deptToRemove = scanner.nextLine();
        Department departmentToRemove = findDepartment(departments, deptToRemove);

        if (departmentToRemove == null) {
            System.out.println("Department not found.");
            return;
        }

        System.out.println("Enter employee ID to remove:");
        int empId = scanner.nextInt();
        if(departmentToRemove.removeEmployee(empId)) {
            System.out.println("Employee removed.");
        }
        else {
            System.out.println("Employee not found.");
        }
    }

    public void addDepartment() {
        System.out.println("Enter department name:");
        String newDeptName = scanner.nextLine();
        departments.add(new Department(newDeptName));
        System.out.println("Department added.");
    }

    private Department findDepartment(ArrayList<Department> departments, String name) {
        for (Department dept : departments) {
            if (dept.getDepartname().equalsIgnoreCase(name)) {
                return dept;
            }
        }
        return null;
    }
}
