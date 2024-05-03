import java.util.Scanner;

public class Typecheck {
    public static void main(String[] args) {
        System.out.println("Type Something");
        Scanner in = new Scanner(System.in);


        char ch = in.next().trim().charAt(0);

        if(ch >= 'a' && ch <= 'z'){
            System.out.println("Lowercase");
        }else {
            System.out.println("Uppercase");
        }
    }
}
