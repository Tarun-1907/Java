import java.util.*;
public class jp62 {
        public static int secondHighest(String s) {
            // ArrayList<Integer>list=new ArrayList<>();
            // HashSet<Integer> set=new HashSet<>();
            // for(int i=0;i<10;i++){
            // set.add(i);
            // }
            // for(int i=0;i<s.length();i++){
            //     int s0=s.charAt(i);
            //    if(set.contains(s0)){
            //     list.add(s0);
            //    }
            // }
            // Collections.sort(list);
            // int res=0;
            // int l=list.size();
            // if(l==1){
            //     res=-1;
            // }
            // else{
            // res=list.get(l);
            // }
            // return res;
    
    
            HashSet<Character>set=new HashSet<>();
            for(int i=0;i<s.length();i++){
                if(Character.isDigit(s.charAt(i))){
                   set.add(s.charAt(i));
                }
            }
            ArrayList<Character>list=new ArrayList<>(set);
            Collections.sort(list);
            System.out.println(list);
            int l=list.size();
            System.out.println(l);
            if(l==1){
                return -1;
            }
            int res=list.get(l-2);
            return Character.getNumericValue(res);
        }
        public static void main(String args[]){
               String s="dfa12321afd";
               System.out.println(secondHighest(s));
        }
    }