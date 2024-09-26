public class jp24 {
    public static int price(int p,int pf,int d){
        int pizzaprice=p*100;
        int puffprice=pf*20;
        int drinkprice=d*10;
        int totalamount=pizzaprice+puffprice+drinkprice;
        return totalamount;
    }
    public static void main(String args[]){
       System.out.println("Bill Details");
       System.out.println("No of pizzas:10");
       System.out.println("No of puffs:12");
       System.out.println("No of cool drinks:5");
       System.out.println(price(10,12,5));
       System.out.println("ENJOY THE SHOW!!!");
    }
}
