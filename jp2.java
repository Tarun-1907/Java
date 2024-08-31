public class jp2 {

    public static String repeating(String s){
     for(int i=0;i<s.length();i++){
        for(int j=0;j<i;j++){
            if(s.charAt(i)==s.charAt(j)){
                return Character.toString(s.charAt(i));
            }
        }
     }
     return "No repeating character";
    }
    public static void main(String args[]){
    String s="";
    System.out.println(repeating(s));
    }
}