package MethodsLab;

import java.util.Scanner;

public class task1SignOfIntegerNumbers {
    public static void main(String[] args) {

        typeOfNumber();

    }
    public static void typeOfNumber(){
        Scanner scanner = new Scanner(System.in);


        String output = "";
        int n = Integer.parseInt(scanner.nextLine());
        if (n == 0){
            output = "The number 0 is zero.";
        }else if (n < 0){
            output = "The number " + n + " is negative.";
        }else{
            output = "The number " + n + " is positive.";
        }
        System.out.println(output);
    }
}
