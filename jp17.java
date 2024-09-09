public class jp17 {
    public static String lowerc(String s){
        String str="";
        int count=0;
    for(int i=0;i<s.length();i++){
        if(s.charAt(i)>='a' && s.charAt(i)<='z'){
           str+=s.charAt(i);
           count+=1;
        }
    }
    str=str+" "+count;
        return str;
    }

    public static void main(String args[]){
String s="Hello this is the coder ";
System.out.println(lowerc(s));
    }
    
}
