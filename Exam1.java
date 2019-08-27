package quiz;

import java.util.HashMap;
import java.util.Scanner;

public class Exam1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int studentNumber = scanner.nextInt();

        HashMap<String, HashMap<String, Integer>> students = new HashMap<String, HashMap<String, Integer>>();
        HashMap<String, Integer> grades = new HashMap<String, Integer>();
        String subject;
        int mark;
        for (int i = 0; i < studentNumber; i++) {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter student name: ");
            String studentName = input.nextLine();
                for (int j = 0; j < 4; j++) {
                    Scanner sc = new Scanner(System.in);
                    System.out.print("Enter a subject: ");
                    subject = sc.nextLine();
                    System.out.print("Enter a mark: ");
                    mark = sc.nextInt();
                    grades.put(subject, mark);
                }
                students.put(studentName, grades);
        }

        System.out.println(students);



    }

}
