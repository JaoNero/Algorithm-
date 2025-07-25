import java.util.Scanner;

public class M2 {
    public static void main(String[] arg) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter radius: ");
        double radius = input.nextDouble();

        double area = (22.0 / 7) * radius * radius;

        System.out.println("Area of circle that has radius " + radius + " meters is = " + area + " square meters.");

    }
}
