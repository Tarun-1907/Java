public class jp60 {
        public static int[] plusOne(int[] digits) {
            int arr[]=new int [digits.length+1];
            for(int i=0;i<digits.length;i++){
                arr[i]=digits[i];
            }
            if(digits[digits.length-1]==9){
                arr[digits.length]=0;
                arr[digits.length-1]=digits[digits.length-1]+1;
            }
            else{
                arr[digits.length-1]=digits[digits.length-1]+1;
            }
            System.out.println(arr[2]);
            return arr;
        }
        public static void main(String args[]){
            int []digits={1,2,3};
            System.out.println(plusOne(digits));
        }
    }