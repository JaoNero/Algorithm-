// public class main{
//     public static void main(String [] arg){
//         int num1 = 4;
//         int num2 = 6;
//         int sum = num1 + num2;
//         System.out.println("SUM of " + num1 +" and " + num2 +" is " + sum);//
//     }
// }

import java.util.Scanner;

public class main {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        int num1 = input.nextInt();

        System.out.print("Enter num2: ");
        int num2 = input.nextInt();

        int sum = num1+num2;

        System.out.println("Sum = " + sum);

    }
}
