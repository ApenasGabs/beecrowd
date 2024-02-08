package challenges;
import java.util.Scanner;

public class Bee003 {

	public static void main(String[] args) {
		Scanner inputValues = new Scanner(System.in);
		int firstValue, secondValue, result ;
		firstValue = inputValues.nextInt();
		secondValue = inputValues.nextInt();
		result = firstValue + secondValue;
		System.out.printf("SOMA = "+ result);
		System.out.printf("\n");
	}

}
