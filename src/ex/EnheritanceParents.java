package ex;


	abstract class EnheritanceParents {
		int number1; //부모 클래스에 변수 선언
		int number2;
		//setNumber 소환하면 인트타입의 no1과 no2의 매개변수를 받고 그 매개변수를 해당 클래스의 변수에 넣는다
		public void setNumber(int no1, int no2) {
			this.number1 = no1;
			this.number2 = no2;
		}
		public abstract void sum();
		public abstract void avg();
		public void run() {
			sum();
			avg();
		}
	
	class EnheritanceChild1 extends EnheritanceParents {
		public void sum() {
			System.out.println("this is sparta합계 " + (this.number1 + this.number2));
		}
		public void avg() {
			System.out.println("this is sparta평균 " + (this.number1 + this.number2) / 2);
		}
	}
	class EnheritanceChild2 extends EnheritanceParents {
		public void sum() {
			System.out.println("나는 이렇게 출력 Sum " + (this.number1 + this.number2));
		}
		public void avg() {
			System.out.println("나는 이렇게 출력 Avg " + (this.number1 + this.number2) / 2);
		}
	}
	public class EnheritanceEx {
		public static void execute(EnheritanceParents cal) {
			System.out.println("실행결과");
			cal.run();
		}
		public static void main(String[] args) {
			//
			EnheritanceParents c1 = new EnheritanceChild1();
			EnheritanceParents c2 = new EnheritanceChild2();
			c1.setNumber(30, 20);
			c2.setNumber(30, 20);
			execute(c1);
			execute(c2);
		}
	}
}
