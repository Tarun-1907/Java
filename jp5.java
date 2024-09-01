import java.util.*;
public class jp5{
    public static int sum(int arr[]){
        List<Integer> listo=new ArrayList<>();
        List<Integer> liste=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                listo.add(arr[i]);
            }
            else{
            liste.add(arr[i]);
        }
    }
    System.out.println(listo);
    System.out.println(liste);
    Collections.sort(listo);
    Collections.sort(liste);

    int a=liste.get(1);
    System.out.println(a);
    int b=listo.get(listo.size()-2);
    System.out.println(b);
    int ad=a+b;

        return ad;
    }
    public static void main(String args[]){
    int arr[]={1,8,0,2,3,5,6};
    System.out.println(sum(arr));
    }
}