package practice.practice04;

public class Dog extends Animal{
	//フィールド
	private String furColor;
	//コンストラクタ
	public Dog(String name, int age, String furColor) {
		//親クラス(Animal)のコンストラクタ呼び出し
		super (name, age);
		this.furColor = furColor;
	}
	//アクセッサ
	public String getFurColor() {
		return furColor;
	}
	public void setFurColor(String furColor) {
		this.furColor = furColor;
	}
	
	@Override
	public void showInfo() {
		super.showInfo();
		System.out.println("毛の色：" + this.furColor);
	}
	public void cry() {
		System.out.println("鳴き声：" + "ワン");
	}

}
