package Day03;

public class ForEx01 {
	public static void main(String[] args) {
		//1~10
		int sum = 0;
		for(int i = 1; i <= 10; i++) {
			sum += i;
		}
		System.out.println("합계:" + sum);
		System.out.println("========================");
		
		//10~1
		for(int i = 10; i >= 1; i--) {
			System.out.println(i);
		}
	}
}
