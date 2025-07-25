import java.util.Scanner;

public class M3 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter salary: ");
        double D1 = input.nextDouble();

        System.out.print("Enter tax: ");
        double F1 = input.nextDouble();

        double sum = D1 * F1;

        System.out.println("Sum = " + sum + " Bath");

    }
}
