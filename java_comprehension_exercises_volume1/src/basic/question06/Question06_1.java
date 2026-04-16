package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] massages = new String[4];

		massages[0] = "こんにちは";
		massages[1] = "Javaの学習中";
		massages[2] = "繰り返しの演習";
		massages[3] = "頑張ります";

		for (int i = 0; i < 4; i++) {
			System.out.println(massages[i]);

		}
		System.out.println("繰り返しの処理が終了しました。");

	}
}
