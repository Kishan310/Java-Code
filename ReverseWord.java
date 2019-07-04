import java.util.Scanner;
public class ReverseWord{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("String values : ");
    String reverseString = sc.nextLine();
    String[] arrOfString = reverseString.split("");

    int n =  arrOfString.length;
    String[] arrValue = new String[n];
    for (int i = 0; i < arrOfString.length; i++){
      n = n - 1;
      arrValue[i] =  arrOfString[n];
    }
    for (int i = 0; i < arrValue.length; i++){
      System.out.println("reverse String is : " + arrValue[i]);
    }
  } 
}
