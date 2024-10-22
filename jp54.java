import java.util.*;
public class jp54 {
        public static int[] minAnd2ndMin(int arr[]) {
            int arr0[]=new int[arr.length];
            Arrays.sort(arr);
            int n[]=new int[1];
            for(int i=0;i<arr.length-1;i++){
                if(arr[0]==arr[1]){
                    arr0[i]=arr[i];
                    arr0[i]=arr[i+1];
                }
                else{
                    n[0]=-1;
                    return n;
                }
            }
            return arr;
        }
        public static void main(String args[]){
           int arr[]={2,2,2};
           System.out.println(minAnd2ndMin(arr));
        }
    }