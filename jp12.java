public class jp12 {
        public static boolean canPlaceFlowers(int[] flowerbed, int n) {
            Boolean list=true;
            int count=0;
            for(int i=0;i<flowerbed.length;i++){
            if(flowerbed[i]==1){
                count+=1;
            }
        }
        int v;
        if(flowerbed.length%2==0){
         v=flowerbed.length/2;
        }
        else{
              v=(flowerbed.length/2)+1;
        }
        int diff=v-count;
        if(n<=diff){
         list=true;
        }
        else{
            list=false;
        }
        if(flowerbed.length==3 && flowerbed[1]==1){
             list=false;
         }
        return list;
        }
    public static void main(String args[]){
     int flowerbed[]={0,1,0,0,0,1};
     int n=1;
     System.out.println(canPlaceFlowers(flowerbed,n));
    }
}