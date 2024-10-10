import java.util.Arrays;

public class jp44 {
    public static void replaceelements(int arr[]){
        int arr0[]=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            arr0[i]=arr[i];
        }
     Arrays.sort(arr);
     for(int i=0;i<arr.length;i++){
       arr0[i]=i;
       System.out.println(i);
     }
    }
    public static void main(String args[]){
        int arr[]={4,2,3,6,1,8};
       replaceelements(arr);
    }   
}