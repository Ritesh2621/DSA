public class Maxarray {

   static int max(int A[]){
       int curr=A[0];
       for (int i=0;i<A.length;i++){

           if (A[i]>curr){
               curr=A[i];
           }

       }
       return curr;
   }
    public static void main(String[] args) {
        int A[]= {1,7,8,134,4,5,9,74};
        System.out.println(max(A));
    }
}
