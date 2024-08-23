public class 0476lc{
    public static int findComplement(int num) {
        String n=Integer.toBinaryString(num);
        System.out.println(n);
        String c="";
        for(int i=0;i<n.length();i++){
         if(n.charAt(i)=='0'){
            c+=1;
            System.out.println(c);
         }
        else{
            c+=0;
            System.out.println(c);
         }
        }
        int s=Integer.parseInt(c, 2);
 
        return s;
    }
    public static void main(String args[]){
        int num=5;
        System.out.println(findComplement(num));
    }
} 
