import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
       int ans = sum();
        System.out.println(ans);
    }

    static int sum(){
        System.out.println("Enter num1");
        Scanner in = new Scanner(System.in);
        int num1 = in.nextInt();
        System.out.println("Enter num2");
        Scanner s = new Scanner(System.in);
        int num2 = s.nextInt();
        int sum1 = num1+num2;
        return sum1;
    }

}
