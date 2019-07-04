public class TestArray{
  public static void main (String[] args){
    int i;
    int[] arr = new int[5];
    arr[0] = 10;
    arr[1] = 20;
    arr[2] = 30;
    arr[3] = 40;
    arr[4] = 50;

    for (i = 0; i <= arr.length; i++){
      System.out.println("Index 0 : " + arr[0]);
      if (i <= 5){
        System.out.println("");
        break;
      }
    }

    for (i = 0; i <= arr.length; i++){
      System.out.println("Index 1 : " + arr[1]);
      if (i <= 5){
        System.out.println("");
        break;
      }
    }

    for (i = 0; i <= arr.length; i++){
      System.out.println("Index 2 : " + arr[2]);
      if (i <= 5){
        System.out.println("");
        break;
      }
    }

    for (i = 0; i <= arr.length; i++){
      System.out.println("Index 3 : " + arr[3]);
      if (i <= 5){
        System.out.println("");
        break;
      }
    }

    for (i = 0; i <= arr.length; i++){
      System.out.println("Index 4 : " + arr[4]);
      if (i <= 5){
        System.out.println("");
        break;
      }
    }
  }
}
