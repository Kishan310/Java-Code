import java.util.Scanner;
public class Sreverse{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the array length : ");
    int n = sc.nextInt();
    int[] arr = new int[n];
    System.out.println("enter array elements : ");
    for(int i = 0; i < arr.length; i++){
     arr[i] = sc.nextInt();
    }
    for (int i = arr.length - 1; i >= 0; i--){
      System.out.println("reverse value " + i + " : " + arr[i]);
    }
  }
}
