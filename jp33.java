import java.util.HashSet;

public class jp33 {
    
    public static int removeduplicates(int arr[]){
       HashSet<Integer> set=new HashSet<>();
       for(int i=0;i<arr.length;i++){
        set.add(arr[i]);
       }
       int k=set.size();
       int j=0;
       for(int x:set){
        arr[j++]=x;
       }
       return k;
    }

    public static void main(String args[]){
     int arr[]={3,2,4,1,5,5,6,4,3,2,4,5};
     int k=removeduplicates(arr);
     for(int i=0;i<k;i++){
     System.out.println(arr[i]);
     }

    }
    
}
