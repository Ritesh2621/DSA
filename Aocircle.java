import java.awt.geom.Area;
import java.util.Scanner;

public class Aocircle {
    public static void main(String[] args) {
        System.out.println("Enter Radius");
        Scanner in = new Scanner(System.in);
        int r = in.nextInt();

        if(r>0){
            double a = 3.14159 * r * r;
            System.out.println("Area of circle is"+ a );
        }else {
            System.out.println("Negative number");
        }

    }
}
