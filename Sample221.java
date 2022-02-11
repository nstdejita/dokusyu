// 社員を表すEmployeeクラスの定義
class Employee {
  private String name;  // 名前
  private int salary;   // 給与
  
  // 引数のないメソッド（すべてのフィールドの値を表示する）
  public void show() {
    System.out.print("私の名前は、" + this.name + "です。");
    System.out.println("私の給与は、" + this.salary + "円です。");
  }
  
  // 引数のあるメソッド（引数で指定したフィールドの値を表示する）
  public void show(String fieldName) {
    if (fieldName.equals("名前")) {
      System.out.println("私の名前は、" + this.name + "です。");
    }
    else if (fieldName.equals("給与")) {
      System.out.println("私の給与は、" + this.salary + "円です。");
    }
  }

  // コンストラクタ
  public Employee(String name, int salary) {
    this.name = name;
    this.salary = salary;
  }
}

// Employeeクラスをテストするクラス
public class Sample221 {
  public static void main (String[] args) {
    // Employeeクラスのインスタンスを生成する
    Employee tanaka = new Employee("田中一郎", 250000);

    // 引数のないメソッドを呼び出す
    tanaka.show();

    // 引数が１つあるメソッドを呼び出す
    tanaka.show("給与");
    tanaka.show("名前");
  }
}