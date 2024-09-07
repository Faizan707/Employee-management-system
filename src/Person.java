public class Person {
    private static int EMPLOYEE_ID = 1;
    private String name;
    private int id;
    private String department;
    private double salary;

    public Person(String name, String department, double salary) {
        this.name = name;
        this.id = EMPLOYEE_ID++;
        this.department = department;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
