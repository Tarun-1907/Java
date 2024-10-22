public class jp47 {
    public static String remove(String s){
        String res="";
        int j=0;
        for(int i=0;i<s.length();i++){
         if(s.charAt(i)==')'){
           j--;
         }
         if(j!=0){
         res=res+s.charAt(i);
         }
         if(s.charAt(i)=='('){
            j++;
         }
        }
        return res;
    }
    public static void main(String args[]){
        String s="(()())(())";
        System.out.println(remove(s));
    }
    
}
