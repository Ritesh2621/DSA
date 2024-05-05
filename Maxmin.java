import java.util.Scanner;

public class Maxmin {
    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        System.out.println("Print 3 numbers");
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();

        maxmin(x,y,z);
    }
    static void maxmin(int a ,int b,int c){
        if(a<b){
            if(b<c){
                System.out.println(c);
            }else {
                System.out.println(b);
            }
        }
        else{
            System.out.println(a);
        }
    }
}
