public class jp73 {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        else{
            return n+sum(n-1);
        }
    }
    public static int num(int n,int i){
        if(i==1){
         return i;
        }
        else{
        System.out.println(i);
        return num(n,i-1);
        }
    }
    public static int num0(int n,int i){
        if(i>n){
              return i;
        }
        else{
        System.out.println(i);
        return num0(n, i+1);
        }
    }
    public static void main(String args[]){
    System.out.println(num(5,5));
    }
}