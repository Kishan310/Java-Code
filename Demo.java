import java.util.ArrayList;
// import java.util.Collections;
public class Demo{
  public static void main(String[] args){
    ArrayList<String> obj = new ArrayList<String>();
    obj.add("hkkk");
    obj.add("ssskkk");
    ArrayList<String> list = new ArrayList<String>();
    for ( int i= obj.size() - 1; i >= 0; i-- ){
      list.add(obj.get(i));
    }
    for (int j = 0; j < list.size(); j++){
      System.out.println("After Reversing : " + obj);
    }
  }
}
