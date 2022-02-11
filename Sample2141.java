// 列挙型Handの定義
enum Hand {
  GU, CHOKI, PA   // それぞれの定数には重複しない値が割り当てられる
}

// 列挙型Handをテストするクラス
public class Sample2141 {
  public static String judge(Hand p1, Hand p2) {
    if (p1 == p2) {
      return "あいこ";
    }
    else if (p1 == Hand.GU    && p2 == Hand.CHOKI || 
             p1 == Hand.CHOKI && p2 == Hand.PA    ||
             p1 == Hand.PA    && p2 == Hand.GU      ) { 
      return "勝ち";
    }
    else {
      return "負け";
    }
  }
  
  // メインメソッド
  public static void main (String[] args) {
    System.out.println(Sample2141.judge(Hand.GU,Hand.GU));
    System.out.println(Sample2141.judge(Hand.CHOKI,Hand.PA));
    System.out.println(Sample2141.judge(Hand.PA,Hand.CHOKI));
  }
}