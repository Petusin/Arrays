import java.util.Scanner;
public class Array_3 {

	public static void main(String[] args) {

	        int[] numbers = new int[4];
	        numbers[0] = 42;
	        numbers[1] = 13;
	        numbers[2] = 12;
	        numbers[3] = 7;

	        System.out.println("Hay " + numbers.length + " elementos en este array.");

	        int index = 0;
	        while (index < numbers.length) {
	            System.out.println(numbers[index]);
	            index++;
	        }

	}

}
