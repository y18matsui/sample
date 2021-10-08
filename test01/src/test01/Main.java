/*
 * Main Created on 2021/09/28
 */
package test01;

public class Main
{

	public static void main(String[] args) {
		// クラスのオブジェクトを生成
		Test c = new Test();
		
		// メンバ変数を参照する
		String str1 = c.name;
		
		// メソッドの呼び出し
		String str2 = c.testMethod();
		
		// 結果を出力
		System.out.println(str1 + str2);
	}
}
