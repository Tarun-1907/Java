public class jp37 {
    public static int reverse_digit(int n){
        int digit0=0;
        while(n>0){
         digit0=digit0*10+n%10;
         n/=10;
        }
        return digit0;
    }

    public static void main(String args[]){
    System.out.println(reverse_digit(153));
    }
    
}
