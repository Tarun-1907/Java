public class jp40 {
    public static String spaceremove(String s){
        String s0="";
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)==' '){
           continue;
        }
        else{
          s0+=s.charAt(i);
        }
    }
    return s0;
}
 
public static void main(String args[]){
System.out.println(spaceremove("he l l o"));
}
}
