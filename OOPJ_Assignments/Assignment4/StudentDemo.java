import java.util.Scanner;


class Student {
    
    String name;
    private double marks1;
    private double marks2;
    private double marks3;

    
    public void assignValues(String name, double marks1, double marks2, double marks3) {
        this.name = name;
        this.marks1 = marks1;
        this.marks2 = marks2;
        this.marks3 = marks3;
    }

    
    public double totalMarks() {
        return marks1 + marks2 + marks3; 
    }

   
    public double averageMarks() {
        return totalMarks() / 3; 
    }

    
    public void displayStudentDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Total Marks: " + totalMarks());
    }
}


public class StudentDemo {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the student's name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter marks for subject 1: ");
        double marks1 = scanner.nextInt();
        
        System.out.print("Enter marks for subject 2: ");
        double marks2 = scanner.nextInt();
        
        System.out.print("Enter marks for subject 3: ");
        double marks3 = scanner.nextInt();

       
        Student student = new Student();

     
        student.assignValues(name, marks1, marks2, marks3);

       
        student.displayStudentDetails();

        
        System.out.println("Average Marks: " + student.averageMarks());

      
    }
}
/*F:\OOPJ\Assignment4>java StudentDemo
Enter the student's name: Prajakta
Enter marks for subject 1: 86
Enter marks for subject 2: 89
Enter marks for subject 3: 90
Student Name: Prajakta
Total Marks: 265.0
Average Marks: 88.33333333333333

F:\OOPJ\Assignment4>*/

/*F:\OOPJ\Assignment4>javac StudentDemo.java

F:\OOPJ\Assignment4>java StudentDemo
Enter the student's name: Ankita
Enter marks for subject 1: 90
Enter marks for subject 2: 89
Enter marks for subject 3: 87
Student Name: Ankita
Total Marks: 266.0
Average Marks: 88.66666666666667

F:\OOPJ\Assignment4>*/