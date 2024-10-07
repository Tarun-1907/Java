public class jp45 {
    public static boolean areSentencesSimilar(String sentence1, String sentence2) {
         boolean istrue= true;
         String fruits[]=sentence2.split(" ");
         for(int i=0;i<fruits.length;i++){
         if(sentence1.contains(fruits[i])){
           return istrue;
         }
         else{
            istrue=false;
         }
         }
    return istrue;
    }
    public static void main(String args[]){
       String sentence1="Hello World";
       String sentence2="World";
       System.out.println(areSentencesSimilar(sentence1,sentence2));

    }
}