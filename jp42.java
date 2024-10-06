import java.util.HashMap;

public class jp42 {
    public static int removeunduplicate(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        if(!map.containsKey(arr[i])){
            System.out.println(arr[i]);
            map.put(arr[i],1);
        }
      }
      return 1;
    }
  public static void main(String args[]){
      int arr[]={1,2,3,4,4,4,5,6};
      removeunduplicate(arr);
      }
  }