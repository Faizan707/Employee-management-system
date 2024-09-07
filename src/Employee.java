public class Employee extends Person {

    public Employee(String name, String department, double salary) {
        super(name, department, salary);
    }

    void display_info() {
        System.out.println("Name: " + getName() + ", Department: " + getDepartment() + ", Salary: " + getSalary() + ", ID: " + getId());
    }
}
