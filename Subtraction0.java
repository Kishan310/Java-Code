import java.util.Scanner;
public class Subtraction0{
  public static void main(String[] args){
    double num1, num2, sum;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter first num : ");
    num1 = sc.nextDouble();

    System.out.println("enter sec num : ");
    num2 = sc.nextDouble();

    sc.close();
    sum = num1 - num2;
    System.out.println("total : " +sum);
  }
}
