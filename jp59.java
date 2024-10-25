import java.util.*;
public class jp59 {
    public static boolean pangram(String s){
        s=s.toLowerCase();
        HashSet<Character> set=new HashSet<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a' && s.charAt(i)<='z'){
                set.add(s.charAt(i));
            }
        }
        return set.size()==26;
    }
    public static void main(String args[]){
      String s="abcdefghijklmnopqrstuvwxyz";
      System.out.println(pangram(s));
    }   
}