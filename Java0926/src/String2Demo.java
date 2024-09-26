
public class String2Demo {

	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = new String("Hi Java!");
		String s3 = "Hi, Code!";
		String s4 = "hi, java!";
		
		
		System.out.println("문자열 비교 => "+ s1.equals(s2));
		System.out.println("문자열 비교 => "+ s1.equals(s3));
		System.out.println("문자열 비교 => "+ s1.equals(s4));
		// ingorecase : 대소문자 비교하지 않고 그냥 문자만 같다면 true 출력
		System.out.println("문자열 비교 => "+ s1.equalsIgnoreCase(s4));
		
		System.out.println(s1.compareTo(s3));
		System.out.println(s1.compareToIgnoreCase(s4));
		System.out.println(s3.compareTo(s4));
		System.out.println("Hi, Java!".compareToIgnoreCase("hi, java"));
	}
}
