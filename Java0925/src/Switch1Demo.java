
public class Switch1Demo {

	public static void main(String[] args) {
		int number = 2;
		switch (number) {
		case 3:
			System.out.print("*");
		case 2:
			System.out.print("*");
		case 1:
			System.out.print("*");
		// break가 없으면 그 아래쪽 case도 다 출력한다.

		}
	}

}
