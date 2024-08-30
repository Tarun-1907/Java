public class jp1 {
    public static int score(String s){
        int count=0;
        int count0=0;
        for(int i=0;i<s.length();i++){
        if(s.charAt(i)=='H'){
          count+=2;
          count0+=1;
        }
        else{
           count-=1;
           count0-=1;
        }
        if(count0>2){
            break;
        }
        // System.out.println(count);
    }
    return count;
    }
    public static void main(String args[]){
    String s="HTHHTTHTHHHT";
    System.out.println(score(s));
    }
}