public class jp7{
    public static String reverse(String s){
        String st="";
        for(int i=s.length()-1;i>0;i--){
            st+=s.charAt(i);
        }
        st+=s.charAt(0);
        return st;
    }

    public static void main(String args[]){
    String s="hello";
    System.out.println(reverse(s));
    }
}