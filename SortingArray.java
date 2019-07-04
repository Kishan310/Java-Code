import java.util.Arrays;
public class SortingArray{
  public static void main(String[] args){
    int arr[] = {5,78,52,60};
    for (int i = 0; i <= 5; i++){
      Arrays.sort(arr);
      System.out.println("sorted arr : " + arr[i]);
      if (i != arr.length){
        System.out.println("");
      }
    }
  }
}
