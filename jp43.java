import java.util.*;
public class jp43 {
    public static void repeated(int arr[]){
      Map<Integer,Integer>map=new HashMap<>();
      for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
      }
      for(Map.Entry<Integer,Integer> entry:map.entrySet()){
        if(entry.getValue()>1){
           System.out.println(entry.getKey()+" "+entry.getValue());
        }       
      }
    }
    public static void main(String args[]){
     int arr[]={1,2,2,2,3,4,5,5,5,3,3,3,5,6,5,3,3,5,3,3};
     repeated(arr);
    }
    
}
