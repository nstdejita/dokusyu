// 独自の例外クラスの定義
class InvalidYearException extends Exception {
  // コンストラクタ
  public InvalidYearException(String message) {
    super(message);
  }
}

// 独自の例外クラスをテストするクラス
public class Sample2121 {
  // うるう年の判定をするメソッド
  public static boolean isLeapYear(int year) throws InvalidYearException {
    if (year < 0) {
      // 西暦がマイナスの場合は例外をスローする
      throw new InvalidYearException("西暦にマイナスが指定されました！");
    }
    else {
      return year % 4 == 0 && year % 100 != 0 || year % 400 == 0 ;
    }
  }

  public static void main (String[] args) {
    try {
      System.out.println("2020年 = " + Sample2121.isLeapYear(2020));
      System.out.println("-123年 = " + Sample2121.isLeapYear(-123));
    }
    catch (Exception e) {
      System.out.println(e);
    }
  }
}