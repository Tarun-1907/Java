class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int x_val=x;
        while(x>0){
            rev=rev*10+x%10;
            x=x/10;
        }
        if(x_val!=rev || x<0){
          return false;
        }
        return true;
    }
}