
public class Lesson0412 {
	public static void main(String[] args) {
		// DNAの記号をランダムに表示する
		int[] seq = new int[10];
		
		// 塩基配列をランダムに生成
		for (int i = 0; i < seq.length; i++) {
			seq[i] = new java.util.Random().nextInt(4);
		}
		
		// 生成した塩基配列の記号を表示
		for (int i = 0; i < seq.length; i++) {
//			switch (seq[i]) {
//				case 0:
//					System.out.println("A ");
//					break;
//				case 1:
//					System.out.println("T ");
//					break;
//				case 2:
//					System.out.println("G ");
//					break;
//				case 3:
//					System.out.println("C ");
//					break;
			
			// 上記のswitch文は、下記のように省略できる
			char[] base = {'A', 'T', 'G', 'C'};
			System.out.print(base[seq[i]] + " ");
		}
	}
}
