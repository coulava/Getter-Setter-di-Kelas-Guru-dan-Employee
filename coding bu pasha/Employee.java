//object class
public class Employee {
    private double salary;
    private String name;

    public double getSalary() {
        return this.salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    /* Constructor nama sama dgn nama class*/
    public Employee() {
        salary = 0;
        name = "";
    }

    // Constructor Parameter
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    // method
    public void print() {
        System.out.println("name: " + name);
        System.out.println("salary: " + salary);

    }

}
