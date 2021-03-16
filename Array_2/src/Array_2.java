import java.util.Scanner;
public class Array_2 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] numbers = new int[5];
		numbers[0] = 42;
		numbers[1] = 13;
		numbers[2] = 12;
		numbers[3] = 7;
		numbers[4] = 1;

		System.out.println("Which index should we access? ");
		int index = Integer.valueOf(reader.nextLine());
//El valor contenido en una matriz también se puede asignar como el valor de otra variable.

		int number = numbers[index];
		System.out.println(number);

	}

}
