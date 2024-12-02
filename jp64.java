import java.util.*;
public class jp64 {
        public static int sumOfUnique(int[] nums) {
        ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i]!=nums[j]){
                    list.add(i);
                }
            }
        }
        int sum=0;
        for(int i=0;i<list.size();i++){
        sum+=list.get(i);
        System.out.println(sum);
        }
        return sum;
        }
        public static void main(String args[]){
          int []nums={1,2,3};
          System.out.println(sumOfUnique(nums));
        }
    }