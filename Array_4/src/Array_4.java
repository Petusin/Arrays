import java.util.Scanner;
public class Array_4 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		System.out.print("Cuantos numero quieres ingrasar? ");
		int howMany = Integer.valueOf(reader.nextLine());

		int[] numbers = new int[howMany];

		System.out.println("Entra los numeros:");

		int index = 0;
		while (index < numbers.length) {
		    numbers[index] = Integer.valueOf(reader.nextLine());
		    index = index + 1;
		}


		System.out.println("Estos son los numeros entrados:");

		index = 0;
		while (index < numbers.length) {
		    System.out.println(numbers[index]);
		    index = index + 1;
		}
	}

}
