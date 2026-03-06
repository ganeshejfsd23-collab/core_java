package abc;

class Employee {

    int id;
    String name;
    int salary;

    // Parameterized Constructor
    Employee(int i, String n, int s) {
        id = i;
        name = n;
        salary = s;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Employee Salary: " + salary);
    }

    public static void main(String[] args) {

        Employee e1 = new Employee(101, "Ganesh", 50000);
        Employee e2 = new Employee(102, "Ej", 60000);

        e1.display();
        System.out.println();
        e2.display();
    }
}
