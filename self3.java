/*Step - 1 --> 3/6 
Given the integer day denoting the day number, print on the screen which day of the week it is.
Week starts from Monday and for values greater than 7 or less than 1, print Invalid.
Ensure only the 1st letter of the answer is capitalised.
*/
import java.util.Scanner;

class threeOfOne {
    public void printNumber(Scanner sc) {
        int number = sc.nextInt();
        switch (number) 
        {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default :
                System.out.println("Invalid");
        }
    }
}

class self3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        threeOfOne obj = new threeOfOne();
        obj.printNumber(sc);
    }
}