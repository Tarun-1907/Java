public class jp34 {
    public static void addfirstelement(int arr[],int i){
        int k=0;
        arr[k]=i;
    }
    public static void addlastelement(int arr[],int i){
        int k=arr.length-1;
         arr[k]=i;
    }
    public static void main(int arr[],int i){
        int k=1;
        arr[k]=i;
    }
    public static void main(String args[]){
       int i=8;
       int arr[]={5,6,3,2,4,1};
       addfirstelement(arr,i);
       addlastelement(arr,i);
       for(int j=0;j<arr.length;j++){
        System.out.println(arr[j]);
       }
    }   
}