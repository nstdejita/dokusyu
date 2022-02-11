import java.util.Calendar;

public class Sample331 {
  public static void main (String[] args) {
    // 現在の日時のカレンダーを取得する
    Calendar cal = Calendar.getInstance();
    
    // 現在の日に１０日を加える
    cal.add(Calendar.DATE, 10);
    
    // 日時を年、月、日で表示する
    int year = cal.get(Calendar.YEAR);
    int month = cal.get(Calendar.MONTH) + 1;  // 1月がゼロなので
    int day = cal.get(Calendar.DATE);
    System.out.println("現在の１０日後は、" + year + "年" + month + "月" + day + "日です。");
  }
}