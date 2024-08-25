public class 01lc{
    public static int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
        int sum=0;
        for(int i=0;i<nums.length-1;i++){
         sum=nums[i]+nums[i+1];
         if(sum==target){
          arr[0]=i;
          arr[1]=i+1;
         }
        }
      return arr;
    }
    public static void main(String args[]){
        int target=6;
        int nums[]={3,2,3};
        System.out.println(twoSum(nums,target));
    }
}
