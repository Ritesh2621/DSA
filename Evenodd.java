import java.util.Scanner;

public class Evenodd {
    public static void main(String[] args) {
//        Scanner in = new Scanner(System.in);
//        System.out.println("Print a number");
//        int x = in.nextInt();
//
//        eo(x);

        Scanner in = new Scanner(System.in);
        System.out.println("enter your age");
        int age = in.nextInt();

        umar(age);
    }

//    static void eo(int a){
//        if(a%2==0){
//            System.out.println("Number is even");
//        }else {
//            System.out.println("Number is odd");
//        }
//    }

    static void umar(int a){
        if(a>18){
            System.out.println("eligible");
        }else{
            System.out.println("not Eligible");
        }
    }

}
