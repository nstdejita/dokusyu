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
  
  // ２つの点の座標を加えた点を生成するメソッド
  public static Point add(Point p1, Point p2) {
    return new Point(p1.x + p2.x, p1.y + p2.y);
  }
  
  // toStringメソッドをオーバーライドする
  public String toString() {
    return "x = " + this.x + ", y = " + this.y;
  }
}

// Pointクラスをテストするクラス
public class Sample2111 {
  public static void main (String[] args) {
    // ２つの点を生成する
    Point p1 = new Point(10, 20);
    Point p2 = new Point(30, 40);
    
    // ２つの点の座標を加えた点を生成する
    Point p3 = Point.add(p1, p2);
    
    // 点の座標を表示する
    System.out.println(p3);
  }
}