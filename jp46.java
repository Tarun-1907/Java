public class jp46 {
        public static int minLength(String s) {
         StringBuilder sb=new StringBuilder(s);
         for(int i=0;i<sb.length()-1;i++){
            if(sb.charAt(i)=='A'&&sb.charAt(i+1)=='B'||sb.charAt(i)=='C'&&sb.charAt(i+1)=='D'){
                sb.delete(i,i+2);
            }
        }
        for(int i=0;i<sb.length()-1;i++){
        if(sb.charAt(i)=='A'&&sb.charAt(i+1)=='B' || sb.charAt(i)=='C'&&sb.charAt(i+1)=='D'){
          sb.delete(i,i+2);
        }
    }
         return sb.toString().length();
    }
    public static void main(String args[]){
       String s="ABFCACDB";
       System.out.println(minLength(s));
    }
    }