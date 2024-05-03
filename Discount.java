import java.util.Scanner;

public class Discount {
    public static void main(String[] args) {
        System.out.println("Enter CP and SP");
        Scanner in = new Scanner(System.in);
        float a = in.nextInt();
        float b = in.nextInt();

        float c = ((a-b)/a) * 100 ;
        System.out.println(c + "%");
    }
}
