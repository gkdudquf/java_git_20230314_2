package ex;

public class Example2 {
	public void numberTable() {
		for (int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for (int j = 1; j <= 9; j++) {
				System.out.println(i+" * "+j+" = "+(i*j));
			}
			System.out.println();
		}
	}
}
