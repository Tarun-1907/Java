class Solution {
    public int reverse(int x) {
        int rev_num=0;
        while(x<0){
            if (rev_num < (Integer.MIN_VALUE - (x%10)) / 10) {
                return 0;  
            }
            rev_num=rev_num*10+x%10;
            x=x/10;
        }
        while(x>0){
            if (rev_num > (Integer.MAX_VALUE - (x%10)) / 10) {
                return 0;  
            }
            rev_num=rev_num*10+x%10;
            x=x/10;
        }
        return rev_num;
    }
}