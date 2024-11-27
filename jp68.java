public class jp68 {
    public static void armstrong(int n){
        int rem=0;
        int num=n;
        int sum=0;
        while(num>0){
            rem=num%10;
            sum+=(rem*rem*rem);
            num/=10;
        }
        if(sum==n){
            System.out.println("True");
        }
    }
    public static void main(String args[]){
      int n=153;
      armstrong(n);
    }
}