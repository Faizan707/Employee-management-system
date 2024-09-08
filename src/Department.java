import java.util.ArrayList;

public class Department {
    private String departname;
    private ArrayList<Employee> employees;

    public Department(String departname) {
        this.departname = departname;
        this.employees = new ArrayList<>();
    }

    public String getDepartname() {
        return departname;
    }

    public void setDepartname(String departname) {
        this.departname = departname;
    }

    public void addEmployee(Employee employee) {
        employees.add(employee);
    }

    public void removeEmployee(int employeeId) {
        employees.removeIf(employee -> employee.getId() == employeeId);
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public void displayDepartmentInfo() {
        System.out.println("Department: " + departname);
        for (Employee emp : employees) {
            emp.display_info();
        }
    }
}
