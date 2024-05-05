import java.util.Scanner;

public class Argument {
    public static void main(String[] args) {
//       int ans = sum(20,30);
//        System.out.println(ans);
        Scanner in = new Scanner(System.in);
        System.out.println("Enter your name");
        String name = in.next();
         String personal = Greet(name);
        System.out.println(personal);
    }

    private static String Greet(String name) {
        String msg = "Hello " + name;
        return msg;
    }

    static int sum(int a, int b){
        int sum = a+b;
        return sum;
    }

}
