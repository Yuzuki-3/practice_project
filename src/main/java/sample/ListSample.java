package sample;

import java.util.ArrayList;
import java.util.List;

public class ListSample {

	public static void main(String[] args) {
		// List（可変長配列）の宣言方法
		List<String> strList = new ArrayList<String>();
		strList.add("岩瀬");
		System.out.println(strList.get(0));
	}

}
