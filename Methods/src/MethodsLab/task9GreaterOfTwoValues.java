package MethodsLab;

import java.util.Scanner;

public class task9GreaterOfTwoValues {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String type = scanner.nextLine();
        String firstInput = scanner.nextLine();
        String secondInput = scanner.nextLine();



        if (type.equals("int")){
            int output = bestInt(firstInput, secondInput);
            System.out.println(output);
        }else if (type.equals("char")){
            char output = bestChar(firstInput, secondInput);
            System.out.println(output);
        }else if (type.equals("string")){
            String output = bestString(firstInput, secondInput);
            System.out.println(output);
        }

    }
    private static Integer bestInt(String n1, String n2){
        int num1 = Integer.parseInt(n1);
        int num2 = Integer.parseInt(n2);
        if (num1 > num2){
            return num1;
        }else {
            return num2;
        }
    }
    private static Character bestChar(String c1, String c2){
        char char1 = c1.charAt(0);
        char char2 = c2.charAt(0);
        if (char1 > char2){
            return char1;
        }else {
            return char2;
        }
    }
    private static String bestString(String s1, String s2){
        if (s1.compareTo(s2) >= 0){
            return s1;
        }else {
            return s2;
        }
    }
}
