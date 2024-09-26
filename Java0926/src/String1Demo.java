
public class String1Demo {
	public static void main(String[] args) {
		String s1 = "Hi, Java!";
		String s2 = "Hi, Java!";
		String s3 = new String("Hi, Java!");
		String s4 = new String("Hi, Java!");
		
		System.out.println("s1 == s2 -> "+ (s1 == s2)); // 같은 경로를 가르키고있다.
		System.out.println("s1 == s3 -> "+ (s1 == s3)); // 새로운 경로를 생성한다.
		System.out.println("s3 == s4 -> "+ (s3 == s4)); // 또 다른 경로를 생성한다.
		
		s1 = s3; // s1의 경로에 s3의 경로를 넣는다. (s1이 s3의 포인트를 가르킨다.)
		System.out.println("s1 == s3 -> "+ (s1 == s3));
		
		// 문자열이 동일한가 비교하는것은 equal 함수를 사용한다.
		System.out.println("\n문자열 비교 => "+ s1.equals(s4));
		System.out.println("문자열 비교 => "+ s1.equals(s2));
		System.out.println("문자열 비교 => "+ s1.equals(s3));
		System.out.println("문자열 비교 => "+ s2.equals(s3));
	}
}
