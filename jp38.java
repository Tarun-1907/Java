public class jp38 {
    public static int palindrome(int n){
        int sum=0;
        while(n>0){
        int digit0=n%10;
        n/=10;
        sum+=digit0;
    }
    int n1=sum;
    int digit1=0;
        while(n1>0){
            digit1=digit1*10+n1%10;
            n1/=10;
        }
        int num=0;
        if(sum==digit1){
        num=1;
        }
        else{
            num=0;
        }
        return num;
    }
    public static void main(String args[]){
     System.out.println(palindrome(56));
    }
    
}
