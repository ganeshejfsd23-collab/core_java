package abc;

class Student {

    int id;
    String name;

    // Default Constructor
    Student() {
        id = 1;
        name = "Ganesh";
    }

    void display() {
        System.out.println("Student ID: " + id);
        System.out.println("Student Name: " + name);
    }

    public static void main(String[] args) {
        Student s1 = new Student(); // constructor called
        s1.display();
    }
}

