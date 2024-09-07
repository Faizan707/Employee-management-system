import java.util.ArrayList;

public class Department {
    private final String departname;
    private final ArrayList<Employee> employees;

    // Constructor
    public Department(String departname) {
        this.departname = departname;
        this.employees = new ArrayList<>();
    }

    public String getDepartname() {
        return departname;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public boolean removeEmployee(int employeeId) {
        return employees.removeIf(employee -> employee.getId() == employeeId);
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + departname);
        for (Employee emp : employees) {
            emp.display_info();
        }
    }
}
