import com.sun.org.apache.regexp.internal.RE;

import java.util.Arrays;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter Width : ");
        double width = scanner.nextDouble();
        System.out.println("Enter height : ");
        double height = scanner.nextDouble();

        Rectangle rectangle = new Rectangle(width, height);
        System.out.println("Your Rectangle \n" + rectangle.display());
        System.out.println("Perimeter of the Rectangle: " + rectangle.getPrimeter());
        System.out.println("Area of the Rectangle: " + rectangle.getArea());
    }
}
