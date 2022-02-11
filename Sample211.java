// 社員を表すEmployeeクラスの定義
class Employee {
  private String name;  // 名前を保存するフィールド
  private int salary;   // 給与を保存するフィールド
  
  // フィールドの値を表示するメソッド
  public void show() {
    System.out.print("私の名前は、" + this.name + "です。");
    System.out.println("私の給与は、" + this.salary + "円です。");
  }
  
  // コンストラクタ
  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }
}

// Employeeクラスを使うSample211クラスの定義
public class Sample211 {
  public static void main (String[] args) {
    // Employeeクラスのインスタンスを二つ生成する
    Employee tanaka = new Employee("田中一郎", 250000);
    Employee suzuki = new Employee("鈴木花子", 300000);
    
    // それぞれのインスタンスのshowメソッドを呼び出す
    tanaka.show();
    suzuki.show();
  }
}