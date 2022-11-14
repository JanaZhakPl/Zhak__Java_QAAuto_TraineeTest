package TestAssignment;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Tasks test = new Tasks();
        Scanner scanner = new Scanner(System.in);
        System.out.println(
                        "1. Составить алгоритм: если введенное число больше 7, то вывести “Привет”\n" +
                        "2.Составить алгоритм: если введенное имя совпадает с Вячеслав, то вывести “Привет, Вячеслав”, если нет, то вывести \"Нет такого имени\"\n" +
                        "3.Составить алгоритм: на входе есть числовой массив, необходимо вывести элементы массива кратные 3\n");
        System.out.println("Выберите один из алгоритмов: ");
        int numberOfTask = scanner.nextInt();

        switch (numberOfTask) {
            case 1:
                System.out.println("Задание 1");
                test.checkNumber();
                break;
            case 2:
                System.out.println("Задание 2");
                test.findByName();
                break;
            case 3:
                System.out.println("Задание 3");
                test.isDivisibleByThree();
                break;
        }
    }
}


