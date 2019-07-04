//Write a program to sort a numeric array and a string array.
import java.util.Arrays;
public class JavaPro5{
  public static void main(String[] args){
    int[] arr = {5,10,15,20,25,30};
    System.out.print("original values : ");
    for(int i = 0; i < arr.length; i++);
    System.out.println(Arrays.toString(arr));
    for (int i = 0; i < arr.length  ; i++);
    Arrays.sort(arr);
    System.out.println("new values : " +Arrays.toString(arr));
  }
}
