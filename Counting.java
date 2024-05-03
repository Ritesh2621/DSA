import java.util.Scanner;

public class Counting {
    public static void main(String[] args) {
 int n = 454894445;

    System.out.println("Enter no u want to check");
    Scanner in =new Scanner(System.in);
    int f = in.nextInt();

    int count =0;
    while(n > 0){
        int rem =n %10;
        if(rem == f){
            count++;
        }
        n = n/10;
    }
System.out.println(count);
    }
}
