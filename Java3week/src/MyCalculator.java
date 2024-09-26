import java.util.Scanner;

public class MyCalculator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("연산>>");
		int FristNum = in.nextInt();
		String Operator = in.next();
		int SecondNum = in.nextInt();
		int Value;
		switch (Operator) { 
		case "+":  
			Value = FristNum + SecondNum;
			System.out.println(FristNum+Operator+SecondNum+"의 계산 결과는"+Value);
			break;
        case "-":  
        	Value = FristNum - SecondNum;
        	System.out.println(FristNum+Operator+SecondNum+"의 계산 결과는"+Value);
        	break;
        case "*":  
        	Value = FristNum * SecondNum;
        	System.out.println(FristNum+Operator+SecondNum+"의 계산 결과는"+Value);
        	break;
        case "/":  
        	if (SecondNum == 0) {
        		System.out.println("0으로 나눌 수 없습니다.");
        		break;
        	}else {
            	Value = FristNum / SecondNum;
            	System.out.println(FristNum+Operator+SecondNum+"의 계산 결과는"+Value);
            	break;
        	}
        default:
        	System.out.println("사칙연산이 아닙니다.");
        	break;
		}
	}
}
