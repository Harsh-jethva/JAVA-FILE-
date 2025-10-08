//Step - 1 --> 1/6
//Problem Statement : Complete the function printNumber which takes an integer input from the user and prints it on the screen.
import java.util.Scanner;

class OneOfOne {
    public void printNumber(Scanner sc) {
        int number = sc.nextInt();
        System.out.println(number);
    }
}

class self1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        OneOfOne obj = new OneOfOne();
        obj.printNumber(sc);
    }
}