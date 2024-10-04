public class jp41 {
    public static int removeduplicates(int arr[]){
        int j=0;
        for(int i=1;i<arr.length;i++){
           if(arr[i]!=arr[j]){
               j++;
            arr[j]=arr[i];
           }
        }
        return j+1;
    }
  public static void main(String args[]){
    int arr[]={1,2,3,4,4,4,5,6};
    int k=removeduplicates(arr);
    for(int i=0;i<k;i++){
 System.out.println(arr[i]);
  }
}
}
