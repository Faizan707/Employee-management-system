import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Department> departments = new ArrayList<>();

        while (true) {
            System.out.println("1. Add employee");
            System.out.println("2. Add department");
            System.out.println("3. Display department and employees");
            System.out.println("4. Remove employee by ID");
            System.out.println("5. Exit");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("Enter department name:");
                    String deptName = scanner.nextLine();
                    Department dept = findDepartment(departments, deptName);
                    if (dept == null) {
                        System.out.println("Department not found.");
                        break;
                    }
                    System.out.println("Enter employee name:");
                    String empName = scanner.nextLine();
                    System.out.println("Enter employee salary:");
                    double salary = scanner.nextDouble();
                    scanner.nextLine();
                    dept.addEmployee(new Employee(empName, deptName, salary));
                    System.out.println("Employee added.");
                    break;

                case 2:
                    System.out.println("Enter department name:");
                    String newDeptName = scanner.nextLine();
                    departments.add(new Department(newDeptName));
                    System.out.println("Department added.");
                    break;

                case 3:
                    for (Department department : departments) {
                        department.displayDepartmentInfo();
                    }
                    break;

                case 4:
                    // Remove Employee
                    System.out.println("Enter department name:");
                    String deptToRemove = scanner.nextLine();
                    Department departmentToRemove = findDepartment(departments, deptToRemove);
                    if (departmentToRemove == null) {
                        System.out.println("Department not found.");
                        break;
                    }
                    System.out.println("Enter employee ID to remove:");
                    int empId = scanner.nextInt();
                    departmentToRemove.removeEmployee(empId);
                    System.out.println("Employee removed.");
                    break;

                case 5:
                    System.out.println("Exiting...");
                    return;

                default:
                    System.out.println("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static Department findDepartment(ArrayList<Department> departments, String name) {
        for (Department dept : departments) {
            if (dept.getDepartname().equalsIgnoreCase(name)) {
                return dept;
            }
        }
        return null;
    }
}
