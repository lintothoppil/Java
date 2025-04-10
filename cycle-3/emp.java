import java.util.Scanner;

class Employee {
    int empId;
    String name;
    double salary;
    String address;

    Employee(int empId, String name, double salary, String address) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.address = address; // Fixed typo: "adress" to "address"
    }
}

class Teacher extends Employee {
    String department;
    String subject;

    Teacher(int empId, String name, double salary, String address, String department, String subject) {
        super(empId, name, salary, address); // Fixed "sup" to "super"
        this.department = department; // Fixed "departmen" to "department"
        this.subject = subject;
    }

    void display() {
        System.out.println("Employee Id: " + empId);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
        System.out.println("Address: " + address);
        System.out.println("Department: " + department);
        System.out.println("Subject Handling: " + subject);
        System.out.println("---------------------------");
    }
}

public class emp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Employee ID: ");
        int empId = sc.nextInt();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Salary: ");
        double salary = sc.nextDouble();
        sc.nextLine(); // Consume newline

        System.out.print("Enter Address: ");
        String address = sc.nextLine();

        System.out.print("Enter Department: ");
        String department = sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        Teacher teacher = new Teacher(empId, name, salary, address, department, subject);
        teacher.display();

        sc.close();
    }
}

