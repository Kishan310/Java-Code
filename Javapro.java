import java.util.Scanner;
public class Javapro{
  public static void main(String[] args){
    int a, b, res;
    Scanner scan = new Scanner(System.in);

    System.out.println("enter two no: ");
    a = scan.nextInt();
    b = scan.nextInt();

    res = a + b;
    System.out.println("Addition = " +res);

    res = a - b;
    System.out.println("Subtraction = " +res);

    res = a / b;
    System.out.println("Divison = " +res);

    res = a * b;
    System.out.println("Multiplication = " +res);
  }
}
