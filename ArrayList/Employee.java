public class Employee extends Person {
    private int empid;
    private int salary;

    // constructor
    public Employee(String name, int age, int empid, int salary) {
        super(name, age);
        this.empid = empid;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return super.toString() + "Employee [empid=" + empid + ", salary=" + salary + "]";
    }

}
