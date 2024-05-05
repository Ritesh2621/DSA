public class Sumvarargs {
    static int sum(int ...s){
        int sum=0;
        for (int i=0;i<s.length;i++){
          sum=sum+s[i];
        }
        return sum;
    }
    public static void main(String[] args) {
        System.out.println(sum(10,20,30,40,50));
    }
}
