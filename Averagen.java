import java.util.Scanner;

public class Averagen {
    public static void main(String[] args) {
        Scanner in =new Scanner(System.in);
        int a = in.nextInt();
       float b = 0;

        for(int i =a ;i> 0 ;i--){
            b=b+i;
        }
        float c = b/a;
        System.out.println(c);
    }
}
