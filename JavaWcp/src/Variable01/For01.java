package Variable01;

public class For01 {
	public static void main(String[] args) {
		for (int number = 1; number <= 5; number++) {
			System.out.println("For01 = " + number);
		}
		
		int [] array = {1,2,3,4,5};
		for (int nb : array) {
			System.out.println("For02 = " + nb);
		}
	}
}
