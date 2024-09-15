public class jp19 {
    public static boolean pn(int n){
        if(n<=1){
            return false;
        }
        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void main(String args[]){
    int n=11;
    System.out.println(pn(n));
    }
}