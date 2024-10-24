public class jp56{
    public static int[] twoSum(int[] nums, int target) {
        int arr[]=new int[2];
    for(int i=0;i<nums.length-1;i++){
    for(int j=i+1;j<nums.length;j++){
        if(nums[i]+nums[j]==target){
            arr[0]=i;
            arr[1]=j;
        }
    }
}
for(int i=0;i<arr.length;i++){
    System.out.println(arr[i]);
}
    return new int[]{};
    }
public static void main(String args[]){
    int nums[]={3,2,3};
    int target=6;
    System.out.println(twoSum(nums,target));
}
}