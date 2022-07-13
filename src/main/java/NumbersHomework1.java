import java.util.Scanner;

public class NumbersHomework1 {
    public static void main(String[] args) {
        int random = (int) (Math.random() * (100 + 1));
        System.out.println("Please enter your name:");
        Scanner in = new Scanner(System.in);
        String name = in.nextLine();
        System.out.println("Let the game begin!");
        while (true) {
            int[] arr = new int[100];
            int[] numbers = new int[100];
            int counter = 0;
            int j;
            for (int i = 0; i < arr.length; i++) {
                arr[i] = random;
                //fill user's entered numbers
                for (j = 0; j < numbers.length; j++) {
                    System.out.println("Please enter number: ");
                    Scanner num = new Scanner(System.in);
                    //check whether input is numeric
                    if (num.hasNextInt()) {
                        int number1 = num.nextInt();
                        counter++;
                        numbers[j] = number1;
                        //core condition
                        if (number1 < arr[i]) {
                            System.out.println("Your number is too small. Please, try again.");
                        } else if (number1 > arr[i]) {
                            System.out.println("Your umber is too big. Please, try again.");
                        } else {
                            System.out.println("Congratulations " + name + "\n");
                            for (j = 0; j < counter; j++) {
                            }
                            return;
                        }
                    } else {
                        System.out.println("Your input isn't a number: ");
                    }
                }
            }
        }

    }
}