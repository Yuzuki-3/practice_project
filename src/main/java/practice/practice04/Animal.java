package practice.practice04;

public class Animal {
	//フィールド
	private String name;
	private int age;
	//コンストラクタ生
	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}
	//アクセッサ
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void showInfo() {
		System.out.println("名前：" + this.name);
		System.out.println("年齢；" + this.age);
	}

}
