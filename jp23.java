import java.text.DecimalFormat;

public class jp23 {
    public static void dist(int l,int d){
       DecimalFormat df =new DecimalFormat("0.00");
       double lk=((l*100)/d);
       System.out.println(df.format(lk));
       double miles=d*0.6214;
       double gallons=l*0.2642;
       double gm=miles/gallons;
       System.out.println(df.format(gm));
    }
    public static void main(String args[]){
      dist(20, 150);
    } 
}
