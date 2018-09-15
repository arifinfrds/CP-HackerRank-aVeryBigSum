import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    int arraySize = scanner.nextInt();

    scanner.nextLine();

    if (!isArraySizeValid(arraySize)) {
      return;
    }

    String numbersString = scanner.nextLine();

    long[] numbers = getNumbers(numbersString);

    for (long number : numbers) {
      if (!isValueValid(number)) {
        return;
      }
    }

    long sum = getSum(numbers);
    System.out.println(sum);
  }

  private static long[] getNumbers(String numbersString) {
    String[] numbersInString = numbersString.split(" ");
    long[] numbers = new long[numbersInString.length];
    for (int i = 0; i < numbersInString.length; i++) {
      numbers[i] = Long.parseLong(numbersInString[i]);
    }
    return numbers;
  }

  private static long getSum(long[] numbers) {
    long sum = 0;
    for (long number : numbers) {
      sum += number;
    }
    return sum;
  }

  private static boolean isArraySizeValid(int arraySize) {
    return (arraySize > 0 && arraySize <= 10);
  }

  private static boolean isValueValid(long value) {
    return (value > 0 && value <= Math.pow(10, 10));
  }

}
