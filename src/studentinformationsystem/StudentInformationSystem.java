/*
Author: Nur Zarith Sofea Binti Meor Zulkarnain
*Program Name: StudentInformationSystem.java
*Description: To display student information system.
*Date: 26/10/2026
*Modified Date: None
*Version: 1.0
*/
 
package studentinformationsystem;

public class StudentInformationSystem {

    public static void main(String[] args) {
        // Display student information
        System.out.println("Student Name: Nur Zarith Sofea Binti Meor Zulkarnain");
        System.out.println("Student ID: S86989");
        // Store the marks and calculate the total
        int mark1 = 40;
        int mark2 = 45;
        int total = mark1 + mark2;

        // Display the marks and total
        System.out.println("Mark 1: " + mark1);
        System.out.println("Mark 2: " + mark2);
        System.out.println("Total Mark: " + total);

        // Determine the result based on total marks
        if (total >= 80) {
            System.out.println("Result: Excellent");
        } else if (total >= 50) {
            System.out.println("Result: Good");
        } else {
            System.out.println("Result: Needs Improvement");
        }
    }
}
