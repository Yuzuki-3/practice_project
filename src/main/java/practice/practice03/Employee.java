package practice.practice03;

public class Employee {
	//フィールド生成
	private String name;
	private int age;

	//コンストラクタ生成
	public Employee(String name, int age) {
		this.name = name;
		this.age = age;
	}

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
	
	//自己紹介
	public void selfIntroduction() {
		System.out.println("氏名：" + this.name);
		System.out.println("年齢：" + this.age);
	}

}
