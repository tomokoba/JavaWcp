
public class Code0309 {
	public static void main(String[] args) {
		// for文のループを2重にして九九の表を出力する
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j < 10; j++) {
				System.out.print(i * j); //掛け算の結果を出力
				System.out.print(" "); //空白を出力
			}
			System.out.println(""); //改行を出力
		}
		
		// break文(繰り返し自体を中断)
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				break;
			}
			System.out.println(i);
		}
		
		// continue文(今回の周だけ中断し、次の周へ)
		for (int i = 1; i < 10; i++) {
			if (i == 3) {
				continue;
			}
			System.out.println(i);
		}
		
		// 無限ループの作成方法
		// while (true) {処理}
		// for (;;) {処理}
	}
}
