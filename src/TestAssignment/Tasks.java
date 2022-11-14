package TestAssignment;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Tasks {
    public void checkNumber() {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите число: ");
        try {
            int someInteger = scanner.nextInt();

            while (someInteger <= 7) {
                System.out.print("Попробуйте еще: ");
                someInteger = scanner.nextInt();
                if
                (someInteger > 7)
                    System.out.println("Привет!");
            }
        } catch (InputMismatchException e) {
            System.out.println("Введенный элемент не является числом");
        }
    }

    public void findByName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя:");
        String someName = scanner.nextLine();
        if (someName.equalsIgnoreCase("Вячеслав")) {
            System.out.println("Привет, " + someName);
        } else {
            System.out.println("Нет такого имени");
        }
    }

    public void isDivisibleByThree() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ведите несколько чисел через пробел");
        String someNumbers = scanner.nextLine();
        int countElement = 0;
        int[] numArr = Arrays.stream(someNumbers
                        .split(" "))
                        .mapToInt(Integer::parseInt)
                        .toArray();
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] % 3 == 0) {
                System.out.print(numArr[i] + " ");
                countElement++;
            }
        }
        if (countElement == 0) {
            System.out.print("Ни одно из введенных чисел не кратно 3");
        }
    }
}
