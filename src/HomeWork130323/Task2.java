package HomeWork130323;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

public class Task2 {
    public static <T> void main(String[] args) {
        System.out.println("Задание 2\n" +
                "Реализуйте метод, который принимает на вход список целых чисел, определяет в списке количество четных чисел и выводит их в консоль. Решите задание именно с применением Stream API.");
        List<Integer> anyIntList = new ArrayList<>(List.of(43214, 324123, 1234243, 6657, 3443, 132123, 4656, 645));
        System.out.println(anyIntList);

        Predicate<Integer> predicate = i -> (int) i % 2 == 0;
        Consumer<Integer> printer = (s) -> System.out.println("Число четных значений в списке " + s);
        findEvenNumber(anyIntList, predicate, printer);

    }

    private static <T> void findEvenNumber(List<T> list, Predicate<T> predicate, Consumer<Integer> printer) {
        int countEvenNumber = (int) list
                .stream()
                .filter(predicate)
                .count();
        printer.accept(countEvenNumber);
    }
}