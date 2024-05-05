import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = in.nextInt();

        fact(a);
    }

    static void fact(int n){
        int fac = 1;
     for (int i=1; i<=n;i++){
         fac=fac*i;
     }
        System.out.println(fac);

    }
}
