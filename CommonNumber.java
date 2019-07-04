//Write a program to find the common elements between two arrays of integers.
public class CommonNumber{
  public static void main(String[] args){
    int[] arr1 = {10,5,87,9,30,35};
    int[] arr2 = {5,100,56,35,23,9,56,70,87};
    for(int i = 0; i < arr1.length; i++){
      for (int j = 0; j < arr2.length; j++){
        if (arr1[i] == arr2[j]){
          System.out.println(arr1[i]);
        }
      }
    }
  }
}
