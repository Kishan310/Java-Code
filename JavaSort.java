import java.util.Arrays;
import java.util.Scanner;
public class JavaSort{
  public static void main(String[] args){
    int a;
    Scanner sc = new Scanner(System.in);
    System.out.print("enter array length : ");
    a = sc.nextInt();
    int[] arr = new int[a];
    System.out.println("enter the array values : ");
    for (int i = 0; i < a; i++){
      arr[i] = sc.nextInt();
    }
    Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++){
      System.out.println("sorted array " + i + " : " + arr[i]);
    }
  }
}
