import java.util.*;

public class jp61 {
        public static int minimumDifference(int[] nums, int k) {
            int diff=0;
            ArrayList<Integer> list=new ArrayList<>();
            if(nums.length==1){
                return 0;
            }
            for(int i=0;i<nums.length-1;i++){
                for(int j=i+1;j<nums.length;j++){
                if(nums[i]>nums[j]){
                diff=nums[i]-nums[j];
                list.add(diff);
                System.out.println(list);
            }
            }
            }
            Collections.sort(list);
            int res=list.get(0);
            return res;
        }
        public static void main(String args[]){
            int[] nums={9,4,1,7};
            int k=2;
            System.out.println(minimumDifference(nums,k));
        }
    }