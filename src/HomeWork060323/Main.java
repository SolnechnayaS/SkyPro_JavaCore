package HomeWork060323;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

import static java.lang.Math.random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задание 1. Напишите реализации функционального интерфейса Predicate, которые проверяют, является ли число положительным. Если число положительное, то предикат должен возвращать true, в противном случае — false.");
        Predicate<Integer> predicate1 = new Predicate<Integer>() {
            @Override
            public boolean test(Integer integer) {
                if (integer < 0) {
                    return false;
                }
                return true;
            }
        };
        System.out.println("Predicate через анонимный класс:");
        System.out.println(predicate1.test(2));

        System.out.println("Predicate через лямбду:");
        Predicate<Integer> predicate2 = x -> x > 0;
        System.out.println(predicate2.test(-1));


        System.out.println("\nЗадание 2. Создайте функциональный интерфейс Consumer, который принимает на вход имя человека и выводит в консоль приветствие в его адрес.");
        Consumer<String> consumer1 = new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println("Hello " + s + "!");
            }
        };

        System.out.println("Consumer через анонимный класс:");
        consumer1.accept("Anonim");

        System.out.println("Consumer через лямбду:");
        Consumer<String> consumer2 = s -> System.out.println("Hello " + s + "!");
        consumer2.accept("Lambda");

        System.out.println("\nЗадание 3. Реализуйте функциональный интерфейс Function, который принимает на вход вещественное число типа Double, а возвращает его округленный вариант типа Long.");
        Function<Double, Long> function1 = new Function<Double, Long>() {
            @Override
            public Long apply(Double x) {
                return Math.round(x);
            }
        };

        System.out.println("Function через анонимный класс:");
        System.out.println(function1.apply(1823917.21313));


        System.out.println("Function через лямбду:");
        Function<Double, Long> function2 = x -> Math.round(x);
        System.out.println(function2.apply(7686786.2345));

        System.out.println("\nЗадание 4. Напишите Supplier, который возвращает случайное число из диапазона от 0 до 100.");
        Supplier<Integer> supplier1 = new Supplier<Integer>() {
            @Override
            public Integer get() {
                return (int) (Math.random() * 100);
            }
        };

        System.out.println("Supplier через анонимный класс:");
        System.out.println(supplier1.get());

        System.out.println("Supplier через лямбду:");
        Supplier<Integer> supplier2 = () -> (int) (Math.random() * 100);
        System.out.println(supplier2.get());

    }
}
