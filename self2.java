/* Step - 1 --> 2/6
Given marks of a student, print on the screen:
Grade A if marks >= 90
Grade B if marks >= 70
Grade C if marks >= 50
Grade D if marks >= 35
Fail, otherwise.*/
import java.util.Scanner;

class twoOfOne {
    public void printNumber(Scanner sc) {
        int number = sc.nextInt();
        if(number>=90)
        {
             System.out.println("Grade - A");
        }
        else if(number>=70 && number<90)
        {
            System.out.println("Grade - B");
        }
        else if(number>=50 && number<70)
        {
            System.out.println("Grade - C");
        }
        else if(number>=35 && number<50)
        {
            System.out.println("Grade - D");
        }
       else{
            System.out.println("Grade - Fail");
       }
    }
}

class self2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        twoOfOne obj = new twoOfOne();
        obj.printNumber(sc);
    }
}