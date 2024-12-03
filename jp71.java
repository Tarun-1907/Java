public class jp71 {
        public static void printNos(int n) {
            int i=1;
            if(i>n){
                   return ;
            }
            System.out.print(i);
            i+=1;
            printNos(n);
        }
        public static void main(String args[]){
            int n=4;
            printNos(n);
        }
    }