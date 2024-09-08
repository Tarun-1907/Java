import java.util.*;
public class jp13 {
    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
     List<Boolean> list=new ArrayList<>();
     int max=Integer.MIN_VALUE;
     for(int i=0;i<candies.length;i++){
        if(max<candies[i]){
            max=candies[i];
        }
     }       
     for(int i=0;i<candies.length;i++){
        int v=candies[i];
        int value=v+extraCandies;
        if(value>=max){
            list.add(true);
        }
        else{
            list.add(false);
     }
     }
     return list;
}
public static void main(String args[]){
    int candies[]={2,3,5,1,3};
    int extraCandies=3;
    System.out.println(kidsWithCandies(candies,extraCandies));
}
}
