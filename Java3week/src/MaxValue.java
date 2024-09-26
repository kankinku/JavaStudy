import java.util.Scanner;
public class MaxValue {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("정수 3개 입력>>");
		int MaxNum = 0;
		for(int i =0; i < 3; i++) {
			int number = in.nextInt();
			if(number > MaxNum) {
				MaxNum = number;
			}
		}
		System.out.println("가장 큰 값은 "+MaxNum);
	}

}
