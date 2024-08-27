public class gcds {
    public String gcdOfStrings(String str1, String str2) {
        String str="";
        int s1=str1.length();  
        int s2=str2.length();
        if(s1>s2){
         for(int i=0;i<s2;i++){
             if(str2.charAt(i)==str1.charAt(i)){
                 str+=str2.charAt(i);
             }
         }
        }
        else if(s1<s2){
         for(int i=0;i<s1;i++){
             if(str1.charAt(i)==str2.charAt(i)){
                 str+=str1.charAt(i);
        }  
     }
 }
 else{
     return str;
 }
 return str;
    }
}
