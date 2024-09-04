import java.util.Arrays;
public class jp6 {
    public static int multp(int arr[],int n,int x){
     n=arr.length;
     int m=0;
     Arrays.sort(arr);
     int a=arr[0];
     int b=arr[1];
       if(a+b<x){
         m=a*b;
         return m;
       }
       return 0;
    }
    public static void main(String args[]){
      int arr[]={9,8,3,-7,3,9};
      int x=4;
      int n=arr.length;
      System.out.println(multp(arr, n, x));
    }
}
