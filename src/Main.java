//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//program to check wheather the string is anagram or not
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
     String a="raman";
     String b="Raman";
     a=a.toLowerCase();
     b=b.toLowerCase();
     if(a.length()==b.length())
     {
         char[] firstArray=a.toCharArray();
         char[] secondArray=b.toCharArray();

         Arrays.sort(firstArray);
         Arrays.sort(secondArray);
         if(Arrays.equals(firstArray,secondArray))
         {
             System.out.println("String is anagram");
         }
         else
         {
             System.out.println("String is not  anagram");
         }


     }

    }
}