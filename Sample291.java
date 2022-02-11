// 社員を表すEmployeeクラスの定義
class Employee {
  private String name;  // 名前

  // フィールドの値を返すメソッド
  public String getName() {
    return this.name;
  }

  // コンストラクタ
  public Employee(String name) {
    this.name = name;
  }
}

// 会社を表すCompanyクラスの定義(Employeeクラスを集約する)
class Company {
  private String name;      // 会社名
  private Employee[] emp;   // 社員　　別クラスのインスタンス
  
  // 会社の情報を表示するメソッド
  public void showInfo() {
    System.out.println("会社名：" + this.name);
    for (int i = 0; i < this.emp.length; i++) {
      System.out.println("社員名：" + this.emp[i].getName());
    }
  }
  
  // コンストラクタ
  public Company(String name, Employee[] emp) {
    this.name = name;
    this.emp = emp;
  }
}

// Companyクラスをテストするクラス
public class Sample291 {
  public static void main (String[] args) {
    // Employeeクラスのインスタンスの配列を作成する
    Employee[] emp = {
      new Employee("田中一郎"),
      new Employee("鈴木花子"),
      new Employee("佐藤次郎")
    };
    
    // Companyクラスのインスタンスを作成する
    Company cmp = new Company("SEプラス", emp);
    
    // 会社の情報を表示する
    cmp.showInfo();
  }
}