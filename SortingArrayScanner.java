import java.util.Scanner;
import java.util.Arrays;
public  class SortingArrayScanner{
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the lenght of array : " );
    int n=sc.nextInt();
    int[] arr = new int[n];
    System.out.println("Enter the array values : ");
    for (int i = 0; i < n; i++){
      arr[i] = sc.nextInt();
    }
   Arrays.sort(arr);
    for (int i = 0; i < arr.length; i++){
     System.out.println("Index " + i + " : " + arr[i]);
    }
  }
}
