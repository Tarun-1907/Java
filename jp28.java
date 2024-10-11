public class jp28 {
    public static void reverse(int arr[]){
        int arr0[]={};
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
          arr0[n-i-1]=arr[i];
        }
        for(int i=0;i<n;i++){
        System.out.println(arr0[i]);
        }
    }
    public static void main(String args[]){
    int arr[]={3,2,4,1,5};
    reverse(arr);
    }   
}
