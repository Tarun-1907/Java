    public class jp0 {
        public static int find_the_superior_element(int arr[],int n){
            int count=0;
            for(int i=n-1;i>0;i--){
                 if(arr[i]<arr[i-1]){
                    count+=1;
                 }
            }
            return count;
        }
        public static void main(String args[]){
           int n=6;
           int arr[]={8,10,6,2,9,7};
           System.out.println(find_the_superior_element(arr, n));
        }   
    }