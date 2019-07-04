import java.util.Scanner;
public class AddTwoNumber{
  public static void main (String[] args){
    int a, b, sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter value of a : ");
    a = sc.nextInt();

    System.out.println("enter value of b : ");
    b = sc.nextInt();

    if(a <= 56 && b != 10){
      System.out.println("true : ");
    } else {
      System.out.println("false : ");
    }
    sc.close();
    sum = a + b;
    System.out.println("total : " +sum);

  }
}
