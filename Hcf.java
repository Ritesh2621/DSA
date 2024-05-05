import java.util.Scanner;

public class Hcf {

    static int gcd(int m,int n){
        while(m!=n){
            if (m>n) {
                m=m-n;
            }
            else n=n-m;
        }
        return m;
    }

    public static void main(String[] args) {
        System.out.println("Enter Two Numbers");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();

        System.out.println(gcd(a,b));
    }
}
