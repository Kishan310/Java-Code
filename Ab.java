import java.util.Scanner;
public class Ab{
  public static void main(String[] args){
    int i;
    Scanner sc=new Scanner(System.in);
    System.out.print("enter the array length : ");
    i = sc.nextInt();
    String[] arr = new String[i];
    int vowel = 0;

    for (i = 0; i < arr.length; i++){
      System.out.print("enter the " + (i) + " string : ");
      arr[i] = sc.next();
    }

    int j;
    for ( j = 0; j < arr.length; j++){
      if(arr[j].contains("a") || arr[j].contains("A") || arr[j].contains("e")   || arr[j].contains("E") || arr[j].contains("i") || arr[j].contains("I") || arr[j].contains("O") || arr[j].contains("o") || arr[j].contains("U") || arr[j].contains("u")){
        vowel = 1;
       System.out.println("Vowels : " + arr[j]);
      }
    }
    if (vowel == 0);
    System.out.println("there is no vowel");
  }
}
