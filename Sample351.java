import java.util.List;
import java.util.ArrayList;
import java.util.Map;
import java.util.HashMap;
import java.util.Set;

public class Sample351 {
  public static void main (String[] args) {
    // 整数のリスト
    List<Integer> intList = new ArrayList<Integer>();
    intList.add(123);
    intList.add(456);
    intList.add(789);
    for (int i = 0; i < intList.size(); i++) {
      System.out.println(i + "番目 = " + intList.get(i)); 
    }
    System.out.println();
    
    // 整数と文字列のマップ
    Map<Integer, String> monthMap = new HashMap<Integer, String>();
    monthMap.put(1, "Januuary");
    monthMap.put(2, "February");
    monthMap.put(3, "March");
    monthMap.put(4, "April");
    monthMap.put(5, "May");
    monthMap.put(6, "June");
    monthMap.put(7, "July");
    monthMap.put(8, "August");
    monthMap.put(9, "September");
    monthMap.put(10, "October");
    monthMap.put(11, "November");
    monthMap.put(12, "December");
    Set<Integer> keys = monthMap.keySet();    // キーのセット
    for (int k : keys) {
      System.out.println(k + "月 = " + monthMap.get(k));
    }
  }
}
