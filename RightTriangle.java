
import java.util.*;
import java.lang.*;

public class RightTriangle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("\nEnter base: ");
        int base = in.nextInt();
        System.out.print("Enter height: ");
        int height = in.nextInt();
        System.out.print("Enter hypotenuse: ");
        int hypotenuse = in.nextInt();
        in.nextLine();

        int sidesSquared = (base * base) + (height * height);
        int hypotSquare = hypotenuse * hypotenuse;

        if (sidesSquared == hypotSquare) {
            System.out.println("\nYes, that's a right triangle!");
        } else {
            System.out.println("\nNope...not a right triangle.");
        }
        
        in.close();
    }
}