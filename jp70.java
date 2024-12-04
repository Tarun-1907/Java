public class jp70 {
    public static void divisors(int n){
        for(int i=1;i<=n;i++){
            if(n%i==0){
            System.out.println(i);
            }
        }
    }
    public static void main(String args[]){
     int n=15;
     divisors(n);
    }
}