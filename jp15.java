public class jp15 {
    public static int gcd(int num1, int num2){
        int n=1;
        if(num1!=num2){
        while(n!=0){
         n=num1%num2;
         if(n!=0){
            num1=num2;
            num2=n;
        }
    }
    }
        return num2;
    }
    public static void main(String args[]){
    int num1=48;
    int num2=18;
    System.out.println(gcd(num1, num2));
    }
    
}
