import java.util.Scanner;
public class Multiplication{
  public static void main (String[] args){
    int a, b, sum;
    Scanner sc = new Scanner(System.in);
      System.out.println("enter the value a : ");
       a = sc.nextInt();
      System.out.println("enter the value b : ");
       b = sc.nextInt();
    if(a == 14 && b != 50 || a < 10 && b >= 13){
      System.out.println("true : ");
    } else {
      System.out.println("false : ");
    }

    sc.close();
     sum = a * b;
     System.out.println("total : " +sum);
  }
}
