package practice.practice04;

public class Sparrow extends Animal {
	//フィールド
	private boolean canFly;
	//コンストラクタ
	public Sparrow(String name,int age, boolean cannFly) {
		super(name, age);
		this.canFly = canFly;
	}
	//アクセッサ
	public void setCanFly(boolean canFly) {
		this.canFly = canFly;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("飛べます");
	}
	public void cry() {
		System.out.println("鳴き声：チュンチュン");
	}
	
}
