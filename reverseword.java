public class revers{
    public static void main(String[] args){
      String word="hello";
      String var="";

      for(int i=word.length()-1;i>=0;i--){
        var = var + word.charAt(i);
      }
      System.out.println("the word is "+ var);
    }
}
      




