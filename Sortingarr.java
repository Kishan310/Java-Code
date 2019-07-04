import java.util.Scanner;
public  class SortingArray{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the lenght of string array :" );
    int n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter all the elements:");
    for (int i = 0; i < n; i++){
     arr[i] = sc.nextInt();
    }
    for (int i = 0; i < arr.length; i++){
      System.out.println("Index " + i + " : " + arr[i]);
    }
  }
}
