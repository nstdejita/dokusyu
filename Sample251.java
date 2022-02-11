// 社員を表すEmployeeクラスの定義
class Employee {
  protected String name;  // 名前
  protected int salary;   // 給与
  
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

// 管理者を表すManagerクラスの定義（Employeeクラスを継承する）
class Manager extends Employee {
  private String post;      // 役職
  
  // フィールドの値を表示するメソッド
  public void show() {
    System.out.print("私の役職は、" + this.post + "です。");
    super.show();
  }
  
  // コンストラクタ
  public Manager(String post, String name, int salary) {
    super(name,salary);
    this.post = post;
  }
}

// Employeeクラスをテストするクラス
public class Sample251 {
  public static void main (String[] args) {
    // Managerクラスのインスタンスを生成し、フィールドの値を表示する
    Manager sato = new Manager("課長", "佐藤次郎", 500000);
    sato.show();
  }
}