import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc{
    public static int removeDuplicates(int[] nums){
      List <Integer> list1=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            int l=nums[i];
            list1.add(l);
        }
        System.out.println(list1);
        Set <Integer> set=new HashSet<>(list1);
        List <Integer> list=new ArrayList<Integer>(set);
        System.out.println(list1);
        int s=list.size();
        return s;
    }
    public static void main(String args[]){
        int nums[]={1,1,2};
        System.out.println(removeDuplicates(nums));
    }
}
