// 点を表すPointクラス
class Point {
  private int x;    // X座標
  private int y;    // Y座標
  
  // equalメソッドをオーバーライドする
  public boolean equals(Object obj) {
    return this.x == ((Point)obj).x && this.y == ((Point)obj).y;
  }
  
  // コンストラクタ
  public Point(int x, int y) {
    this.x = x;
    this.y = y;
  }
}

// Pointクラスをテストするクラス
public class Sample2101 {
  public static void main (String[] args) {
    // 同じ座標でPointクラスのインスタンスを生成する
    Point p1 = new Point(123, 456);
    Point p2 = new Point(123, 456);
    
    // p3が参照するインスタンスをp1と同じにする
    Point p3 = p1;
    
    // ==演算子で比較する（等値）
    System.out.println("p1 == p2 は、" + (p1 == p2) + "です。");
    System.out.println("p1 == p3 は、" + (p1 == p3) + "です。");

    // equalsメソッドで比較する（等価）
    System.out.println("p1.equals(p2)は、" + p1.equals(p2) + "です。");
    System.out.println("p1.equals(p3)は、" + p1.equals(p3) + "です。");
  }
}