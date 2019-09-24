//BubbleSort Example made by lumaaaaaa
import java.util.* ;
public class bubbleSort {
	static void sortTheNumbers() throws InterruptedException {
		System.out.println("This is a simple program made to sort a user defined amount of pseudo-randomly generated numbers (with a user defined maximum value), into ascending order, using Bubble Sort.");
		Scanner input = new Scanner(System. in );
		System.out.println("Please enter the amount of numbers to generate and sort (larger amounts will use more resources):");
		int amountOfNumbersTemp = input.nextInt();
		System.out.println("Please enter the maximum amount in the range for random numbers (eg. range is 0 - input):");
		int maxNumbersTemp = input.nextInt();
		int[] arr;
		int amountOfNumbers = amountOfNumbersTemp + 1;
		int maxNumbers = maxNumbersTemp + 1;
		arr = new int[amountOfNumbers];
		int i = 0;
		int length = arr.length;
		int mem = 0;
		Random random = new Random();
		for (i = 0; i < length; i++) {
			int randomnum = random.nextInt(maxNumbers);
			arr[i] = randomnum;
			System.out.println("Generated number " + arr[i]);
		}
		System.out.println(amountOfNumbers + " numbers have successfully been generated. Continuing onto sorting in 5 seconds...");
		Thread.sleep(5000);
		for (i = 0; i < length; i++) {
			for (int i2 = 1; i2 < (length - i); i2++) {
				if (arr[i2 - 1] > arr[i2]) {
					mem = arr[i2 - 1];
					arr[i2 - 1] = arr[i2];
					arr[i2] = mem;
				}
			}
		}
		System.out.println("Array sorted! All contents of the array will now be printed. Continuing in 5 seconds...");
		Thread.sleep(5000);
		for (i = 0; i < length; i++) {
			int printedNum = i;
			System.out.println("Number " + printedNum + " is: " + arr[i]);
		}
		input.close();
		System.out.println("The array has been successfully sorted using Bubble Sort.");
	}
	public static void main(String[] args) throws InterruptedException {
		sortTheNumbers();
	}
}