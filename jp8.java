import java.util.*;
public class jp8{
    public static int dupli(int arr[]){
      Set<Integer> set=new HashSet<>();
      for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
      }
      System.out.println(set);
      return 1;
    }
    public static void main(String args[]){
    int arr[]={1,1,2,3,4,2,3,4,6,5};
    System.out.println(dupli(arr));
    }
}
