//comman int values in input...
import java.util.Scanner;
public class JavaCommanNumber{
  public static void main(String[] args){
    int a,b;
    Scanner sc1 = new Scanner(System.in);
    System.out.print("enter the first aray length : ");
    a = sc1.nextInt();

    int[] arr1 = new int[a];
    for (int i = 0; i < a; i++){
      System.out.print("enter the " + (i) + " string : ");
      arr1[i] = sc1.nextInt();
    }

    Scanner sc2 = new Scanner(System.in);
    System.out.print("enter the second array length : ");
    b = sc2.nextInt();

    int[] arr2 = new int[b];
    for (int i = 0; i < b; i++){
      System.out.print("enter the " + (i) + " string : ");
      arr2[i] = sc2.nextInt();
    }
    for (int i = 0; i < arr1.length; i++){
      for (int j = 0; j < arr2.length; j++){
        if (arr1[i] == arr2[j]){
         System.out.println(arr1[i]);
       }
      }
    }
  }
}
