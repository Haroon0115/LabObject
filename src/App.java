import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Question 1
        Scanner input = new Scanner(System.in);
        Student Student1 = new Student();
        Student1.firstName = "Haroon";
        Student1.CurrentGPA = 0;
        Student1.studentID = "";
        System.out.println("First Name is currently a student" + "Towson University" + "their GPA is Current GPA" + " their student ID is StudentID");
        Student[] students = new Student[5];
        for (int x = 0; x < students.length; x++) {
            Student student = new Student();
            System.out.print("Enter student's first name: ");
            student.firstName = input.next();
            System.out.print("Enter student's current GPA: ");
            student.CurrentGPA = input.nextDouble();
            input.nextLine();
            System.out.print("Enter student's ID: ");
            student.studentID = input.next();
            students[x] = student;
    }
            // Question 3
            for (int x = 0; x < students.length; x++) {
                System.out.println("First Name is currently a student" + "Towson University" + "their GPA is Current GPA" + " their student ID is StudentID");
            }  
        
        }
        // Question 4
        public static void max(Student[] students){
        double highestGPA = 0;
        String StudentName = "";
        
        for (int x = 0; x < students.length; x++) {
            if (students[x].CurrentGPA > highestGPA){
                highestGPA = students[x].CurrentGPA;
                StudentName = students[x].firstName;
            }
                
            }
            System.out.println(StudentName + "has the highest GPA" + highestGPA);
    
        }
    
    // Question 5
    public static void min(Student[] students){
        double lowestGPA = 0;
        String StudentName ="";
    for (int x = 0; x < students.length; x++) {
        if (students[x].CurrentGPA < lowestGPA){
            lowestGPA = students[x].CurrentGPA;
            StudentName = students[x].firstName;
        }
    }
    System.out.println(StudentName + " has the highest GPA" + lowestGPA); 

       
    }
    public static void avgGPA(Student[]students){
        System.out.println("The average GPA's is:");
        double avg = 0;
        double sum = 0;
        for(int x = 0; x < students.length; x++){
            sum = sum + students[x].CurrentGPA;
            avg = sum/5;
            System.out.println("The Average GPA is" + avg);
        }
    }
}



        