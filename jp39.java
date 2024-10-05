public class jp39 {
    public static void findelement(int arr[],int k){
        int num0=0;
        int num1=0;
        num0=arr[2];
        num1=arr[arr.length-k];
     System.out.println(num0);
     System.out.println(num1);
    }

    public static void main(String args[]){
      int arr[]={1,2,3,4,5,6,7,8};
      findelement(arr, 3);
    }
    
}
