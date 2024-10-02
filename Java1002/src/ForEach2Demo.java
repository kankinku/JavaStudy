
public class ForEach2Demo {

	public static void main(String[] args) {
		int[] one2five = {0,1,2,3,4};
		int sum = mySum(one2five);
		System.out.println(sum);
	}
	
	static int mySum(int[]data) {
		int sum = 0;
		for (int d : data)
				sum += d;
		return sum;
	}

}
