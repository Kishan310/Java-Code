public class EvenOdd{
  public static  boolean isEvenOrOdd(int n ){
   return (n % 2 == 0);
  }
  public static void main(String[] args){
     int n = 2;
   if (isEvenOrOdd(n) == true)
     System.out.println(" even ");
   else
     System.out.println(" odd ");
  }
}
