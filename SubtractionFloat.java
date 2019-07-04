import java.util.Scanner;
public class SubtractionFloat{
  public static void main(String[] args) {
    float num1, num2, sum;
    Scanner sc = new Scanner(System.in);
      System.out.print("enter first num : ");
        num1 = sc.nextFloat();

      System.out.print("enter sec num : ");
        num2 = sc.nextFloat();
    if(num2 * 2 == 0){
      System.out.println("T");
    } else {
      System.out.println("F");
    }
      sc.close();
      sum = num1 - num2;
      System.out.println("total : " +sum);
  }
}
