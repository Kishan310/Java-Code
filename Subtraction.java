import java.util.Scanner;
public class Subtraction{
  public static void main(String[] args){
    int num1, num2, sum;
    Scanner sc = new Scanner(System.in);
      System.out.println("enter first num : ");
       num1 = sc.nextInt();

      System.out.println("enter sec num : ");
      num2 = sc.nextInt();

    if(num1/2 == 0){
     System.out.println("true : ");
    } else {
      System.out.println("false : ");
    }
    sc.close();
    sum = num1 - num2;
    System.out.println("total : " +sum);
  }
}
