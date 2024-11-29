import java.util.Arrays;

public class jp65 {
    public static void ascdescarr(int[] arr){
        Arrays.sort(arr);
        int arrele[]=new int [arr.length];
        for(int i=0;i<arr.length/2;i++){
          arrele[i]=arr[i];
        }
        for(int i=arr.length-1;i>=arr.length/2;i--){
         arrele[i]=arr[i];
        }
        for(int i=0;i<arrele.length;i++){
        System.out.println(arrele[i]);
        }
    }
    public static void main(String args[]){
    int []arr={4,2,4,5,1,2,3,1};
    ascdescarr(arr);
    }
}
