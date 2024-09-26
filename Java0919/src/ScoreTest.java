import java.util.Scanner;

public class ScoreTest {
	public static void main(String [] args) {
		Scanner in = new Scanner(System.in);
		String grade;
		System.out.println("점수를 입력하세요 : ");
		int score = in.nextInt();
		
		if (score >= 90)
			if (score >= 95)
				grade = "A+";
			else 
				grade = "A0";
		else if (score >= 80)
			if (score >= 85)
				grade = "B+";
			else
				grade = "B0";
		else if (score >= 70)
			if (score >= 75)
				grade = "C+";
			else
				grade = "C0";
		else if (score >= 60)
			if (score >= 65)
				grade = "D+";
			else
				grade = "D0";
		else
			grade = "F0";
		System.out.println("당신의 학점은 "+grade);
	}
}
