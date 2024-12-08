public class jp63 {
        public static int finalValueAfterOperations(String[] operations) {
            int res=0;
            for(int i=0;i<operations.length;i++){
                if(operations[i]=="X--" || operations[i]=="--X"){
                 res=res-1;
                }
                else{
                    res=res+1;
                }
            }
            return res;
        }
    public static void main(String args[]){
        String []operations={"--X","X++","X++"};
        System.out.println(finalValueAfterOperations(operations));
    }
    }