public class Varargs {
    static int max(int ...a){
        int max=a[0];
        for (int i=0;i<a.length;i++){

            if (a[i]>max){
                max=a[i];
            }

        }
        return max;
    }
    public static void main(String[] args) {

        System.out.println( max(10,20,80,30,40,50));
    }
}
