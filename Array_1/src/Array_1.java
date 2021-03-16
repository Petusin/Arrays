import java.util.Scanner;
public class Array_1 {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);

		int[] numbers = new int[5];
		numbers[0] = 42;
		numbers[1] = 13;
		numbers[2] = 12;
		numbers[3] = 7;
		numbers[4] = 1;

		System.out.println("¿Aque indice quieres acceder? ");
		int index = Integer.valueOf(reader.nextLine());

		System.out.println(numbers[index]);

	}

}


