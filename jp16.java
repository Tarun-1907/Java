public class jp16 {
    public static int cocon(int noofdays, int coconut, int cocoperbox){
        int count=1;
        int totalcoconeeded=coconut*noofdays;
        for(int i=0;i<noofdays;i++){
        if(totalcoconeeded>cocoperbox){
        totalcoconeeded=totalcoconeeded-cocoperbox;
        count+=1;
        break;
        }
    }
return count;
    }

    public static void main(String args[]){
    int noofdays=10;
    int coconut=2;
    int cocoperbox=16;
    System.out.println(cocon(noofdays, coconut, cocoperbox));
    }
    
}
