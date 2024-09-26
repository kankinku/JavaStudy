import java.util.Scanner;

public class WonToDollar {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("원한를 입력하세요(단위 원)>>");
		int Won = in.nextInt();
		float dollar = (float) (Won / 1100.0);
		
		System.out.println(Won+"원은 $"+dollar+"입니다.");
		
	}

}
