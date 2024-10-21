public class jp52 {
    public static int maxsubarray(int []arr){
     int res=arr[0];
     int maxending=arr[0];
     for(int i=1;i<arr.length;i++){
      maxending=Math.max(maxending+arr[i],arr[i]);
      res=Math.max(res,maxending);
     }
     return res;
    }
    public static void main(String args[]){
        int arr[]={1,2,3,-2,5};
    System.out.println(maxsubarray(arr));
    }
}