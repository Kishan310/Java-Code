import java.util.Scanner;
public class Array{
  public static void main(String[] args){
    int n,sum=0,i;
    Scanner sc = new Scanner(System.in);
    System.out.println("enter the first value : ");
    n = sc.nextInt();
    int a[] = new int[n];
    System.out.println("enter the sec value : ");
    for(i=0; i<n; i++){
      a[i] = sc.nextInt();
      sum = sum + a[i];
    }
    System.out.println("sum : " +sum);
  }
}
