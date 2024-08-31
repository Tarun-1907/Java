public class jp3 {
    public static int diff(int n,int m){
      int divn=0;
      int ndivn=0;
      for(int i=1;i<=m;i++){
        if(i%n==0){
         divn+=i;
        }
        else{
        ndivn+=i;
      }
    }
    return Math.abs(divn-ndivn);
    }
    public static void main(String args[]){
    int n=4;
    int m=20;
    System.out.println(diff(n, m));
    }
    
}
