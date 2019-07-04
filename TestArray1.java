public class TestArray1{
  public static void main (String[] args){
    int i;
    int[] arr = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    for (i = 0; i <= arr.length; i++){
      System.out.println("Index " + i + " : " + arr[i]);
      if (i == arr.length - 1){
        System.out.println("");
        break;
      }
    }
  }
}
