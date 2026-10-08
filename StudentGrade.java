import java.util.Scanner;

public class StudentGrade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your grade: ");
        double grade = scanner.nextDouble();

            String status;
            String rating;

        if(grade >= 90){
            status = "PASSED";
            rating = "Excellent";
        }
        else if(grade >= 85){
            status = "PASSED";
            rating = "Very good";
        }
        else if(grade >= 80){
            status = "PASSED";
            rating = "Good";
        }
        else if(grade >= 75){
            status = "PASSED";
            rating = "Passed";
        }
        else{
            status = "FAILED";
            rating = "Failed";
        }

        System.out.println("Name: " + name);
        System.out.println("Grade: " + grade);
        System.out.println("Status: " + status);
        System.out.println("Rating: " + rating);

        scanner.close();
    }
}