// ペットを表すPetクラスの定義（抽象クラス）
abstract class Pet {
  // 鳴くメソッド（抽象メソッド）
  public abstract void speak();
}

// 犬を表すDogクラスの定義
class Dog extends Pet {
  // 鳴くメソッドの実装
  public void speak() {
    System.out.println("ワン！");
  }
}

// 猫を表すCatクラスの定義
class Cat extends Pet {
  // 鳴くメソッドの実装
  public void speak() {
    System.out.println("ニャン！");
  }
}

// DogクラスとCatクラスをテストするクラス
public class Sample271 {
  public static void main (String[] args) {
    // Petクラスの配列を用意する
    Pet[] p = new Pet[5];
    
    // 配列にDogクラスとCatクラスのインスタンスを格納する
    p[0] = new Dog();
    p[1] = new Cat();
    p[2] = new Dog();
    p[3] = new Cat();
    p[4] = new Cat();
    
    // それぞれのメソッドを呼び出す
    for (int i = 0; i < p.length; i++) {
      p[i].speak();
    }
  }
}