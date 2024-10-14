public class jp31 {
    public static int add(int []arr){
        int sum=0;
        for(int i=0;i<arr.length;i++){
          sum+=arr[i];
        }
        return sum;
    }
    public static void main(String args[]){
        int arr[]={7,8,9,5,6,8};
        System.out.println(add(arr));
    }
}
