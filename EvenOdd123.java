import java.util.Scanner;
public class EvenOdd123{
  public static Boolean isEven(int n){
    if ( n % 2 == 0)
     return true;
    else
     return false;
  }
  public static  void main(String[] args) {
    System.out.println(isEven(123456));
  }
}
