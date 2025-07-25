import java.util.Scanner;

public class M4 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter num1: ");
        double D1 = input.nextDouble();

        System.out.print("Enter num2: ");
        double D2 = input.nextDouble();

        System.out.print("Enter num3: ");
        double D3 = input.nextDouble();

        System.out.print("Enter num4: ");
        double D4 = input.nextDouble();

        System.out.print("Enter num5: ");
        double D5 = input.nextDouble();

        System.out.print("Enter average divisor: ");
        double F1 = input.nextDouble();

        double sum = D1 + D2 + D3 + D4 + D5;
        double average = sum / F1;

        System.out.println("Sum = " + D1 + " + " + D2 + " + " + D3 + " + " + D4 + " + " + D5 + " = " + sum);
        System.out.println("Average = " + average);

    }
}
