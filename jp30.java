import java.util.Arrays;

public class jp30 {
    public static void order(int []arr){
        Arrays.sort(arr);
     for(int i=0;i<(arr.length/2);i++){
        System.out.println(arr[i]);
     }
     for(int i=arr.length-1;i>=(arr.length/2);i--){
        System.out.println(arr[i]);
     }
    }
    public static void main(String args[]){
     int arr[]={7,6,3,4,6,9,8,6};
     order(arr);
    }
}