public class DoWhile{
  public  static  void main (String[] args){
    long x = 123456789012L;
    int y = 1234567890;
    do{
      if (x % 45678 == 0){
        System.out.println ("values : " +x);
      }
      x = x-50000;
    } while ( x >= y);
  }
}
