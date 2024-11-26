import java.util.*;
public class jp72 {
    public static void countfrq(int arr[]){
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<arr.length;i++){
        if(map.containsKey(arr[i])){
            map.put(arr[i],map.get(arr[i])+1);
        }
        else{
            map.put(arr[i],1);
        }
        }
        int min=arr[arr.length-1];
        int minkey=0;
        int max=0;
        int maxkey=0;
        for(Map.Entry<Integer,Integer> entry: map.entrySet()){
            // System.out.println(entry.getKey()+" "+entry.getValue());

            if(entry.getValue()>max){
              max=entry.getValue();
              maxkey=entry.getKey();
            }
            if(entry.getValue()<min){
                min=entry.getValue();
              minkey=entry.getKey();
            }
        }
        System.out.println("Max: "+maxkey+"\nMin: "+minkey);
    }
    public static void main(String args[]){
        int arr[]={1,2,2,3,3,4,4,4,4};
        countfrq(arr);
    }   
}