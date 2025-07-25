import java.util.Scanner;

public class M1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double D1 = scanner.nextDouble();

        double Area = (22.0 / 7) * D1 * D1;

        System.out.println("Area of circle that has radius = " + D1 + " meters is " + Area + " square meters.");

    }
}
