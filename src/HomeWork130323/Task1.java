package HomeWork130323;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;
import java.util.stream.Stream;


public class Task1 {
    public static <T> void main(String[] args) {

        System.out.println("Задание 1\n" +
                "Напишите метод public static void findMinMax, который будет находить в стриме минимальный и максимальный элементы в соответствии с порядком, заданным Comparator'ом.");
        List<Integer> listMinMax = new ArrayList<>(List.of(43214, 3241234, 1234243, 6657, 3443, 132123, 4656, 645));
        System.out.println(listMinMax);
        Stream<T> newStream = (Stream<T>) listMinMax.stream();
        Comparator<T> order = (o1, o2) -> {
            try {
                return (int) o1 - (int) o2;
            } catch (NullPointerException e) {
                return 0;
            }
        };
        BiConsumer<T, T> minMaxConsumer = (t, t2) -> System.out.println("Min: " + t + ", Max: " + t2);
        findMinMax(newStream, order, minMaxConsumer);

    }

    private static <T> void findMinMax(Stream<T> stream, Comparator<T> order, BiConsumer<T, T> minMaxConsumer) {
        List<T> listStream = stream.collect(Collectors.toList());
        if (listStream.size() > 0) {
            listStream.sort(order);
            T min = listStream.get(0);
            T max = listStream.get(listStream.size() - 1);
            minMaxConsumer.accept(min, max);
        } else {
            minMaxConsumer.accept(null, null);
        }

    }
}
