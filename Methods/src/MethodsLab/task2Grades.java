package MethodsLab;

import java.util.Scanner;

public class task2Grades {
    public static void main(String[] args) {

    gradeInWord();
    }

    private static void gradeInWord() {
        Scanner scanner = new Scanner(System.in);

        double grade = Double.parseDouble(scanner.nextLine());

        String gradeInWords = "";

        if (grade >= 2 && grade < 3){
            gradeInWords = "Fail";
        }else if (grade >= 3 && grade < 3.50){
            gradeInWords = "Poor";
        }else if (grade >= 3.50 && grade < 4.50){
            gradeInWords = "Good";
        }else if (grade >= 4.50 && grade < 5.50){
            gradeInWords = "Very good";
        }else if (grade >= 5.50 && grade <= 6.00){
            gradeInWords = "Excellent";
        }
        System.out.println(gradeInWords);
    }
}
