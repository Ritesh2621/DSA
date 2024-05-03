import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {

        System.out.println("Enter number you want to reverse");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int r = 0;

        while(n>0){
            int rem = n % 10;
            n /= 10;

            r = r * 10 +rem;
        }
        System.out.println(r);
    }
}
