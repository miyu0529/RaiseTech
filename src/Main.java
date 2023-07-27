import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String>names=new ArrayList<>();
        names.add("一郎");
        names.add("二郎");
        names.add("三郎");

      try{  System.out.println(names.get(5));} catch (RuntimeException e) {
          System.out.println("NullPointerExceptionをキャッチ");
      }

        try{  System.out.println(names.get(2));} catch (RuntimeException e) {
            System.out.println("NullPointerExceptionをキャッチ");
        }
    }


}