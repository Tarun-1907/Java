import java.util.*;
public class jp10 {
    public static int frequency(int arr[]){
        Map <Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
         int element=arr[i];

         if(map.containsKey(element)){
            map.put(element,map.get(element)+1);
         }
         else{
            map.put(element,1);
         }
        }
        for(int element: map.keySet()){
        System.out.println(element+" " + " "+map.get(element));
        }
        return map.size();
    }
    public static void main(String args[]){
    int arr[]={1,1,2,2,3,4,5,5,6};
    System.out.println(frequency(arr));
    }
    
}
