import java.util.*;

public class jp51 {
    public static int missingNumber(int arr[]) {
        int num=0;
        if(arr.length==1){
            return 2;
        }
        Arrays.sort(arr);
        ArrayList<Integer> list=new ArrayList<>();
        Arrays.sort(arr);
        for(int i=0;i<=arr.length;i++){
            list.add(i+1);
        }
        System.out.println(list);
        int j=0;
        for(int i=0;i<arr.length;i++){
            if(list.get(i)!=arr[j]){
              num=list.get(i);
            //   System.out.println(arr[j]);
              break;
            }
            else{
                j++;
                // System.out.println(j);
            }
        }
    return num;
    }
    public static void main(String args[]){
        int arr[]={2,6,5,1,3};
        System.out.println(missingNumber(arr));
    }
}