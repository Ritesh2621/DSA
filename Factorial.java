import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
       long ans = 1;
        for(int i= n;i>0;i--){
          ans = ans *i;
        }
          System.out.println(ans);
    }
}
