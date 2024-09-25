import java.util.Scanner;

public class jp26 {
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int cse=sc.nextInt();
        int ece=sc.nextInt();
        int mech=sc.nextInt();
        if(cse<0||ece<0||mech<0){
            System.out.println("Input is Invalid");
        }
        else if(cse>ece && cse>mech){
            System.out.println("Highest placement: \nCSE");
        }
        else if(ece>cse && ece>mech){
            System.out.println("Highest placement: \nECE");
        }
        else if(mech>cse && mech>ece){
            System.out.println("Highest placement: \nMECH");
        }
        else if(mech==cse && cse>ece){
            System.out.println("Highest placement: \nCSE \nMECH");
        }
        else if(mech==ece && ece>cse){
            System.out.println("Highest placement: \nECE \nMECH");
        }
        else if(cse==ece && cse>mech){
            System.out.println("Highest placement: \nCSE \nECE");
        }
        else{
            System.out.println("None");
        }
    }
}
