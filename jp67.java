public class jp67 {
        public static int evenlyDivides(int n) {
            int num=n;
            int count=0;
            while(num>0){
                int rem=num%10;
                if(rem!=0 && n%rem==0){
                    count+=1;
                }
                num=n/10;
            }
            return count;
        }

        public static void main(String args[]){
        int n=12;
        System.out.println(evenlyDivides(n));
        }
    }