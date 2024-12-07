public class jp66{
    public static void prime(int n){
        int count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count=count+1;
            }
        }
        if(count>2){
            System.out.println("not prime");
        }
        else{
            System.out.println("prime");
        }
    }
    public static void main(String args[]){
    int n=1483;
    prime(n);
    }
}