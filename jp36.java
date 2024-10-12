public class jp36 {
    
    public static boolean armstrong(int n){
        boolean istrue=true;
        int temp=n;
        int sum=0;
        while(temp!=0){
            int digit0=temp%10;
            temp/=10;
            sum+=digit0*digit0*digit0;
        }
        if(sum==n){
          return istrue;
        }
        else{
            istrue=false;
        }
        return istrue;
    }

    public static void main(String args[]){
     int n=153;
     System.out.println(armstrong(n));
    }
    
}
