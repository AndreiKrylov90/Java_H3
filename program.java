import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.IntStream;

public class program {
    public static void main(String[] args) {

        ex02();
    }

    static void ex01() {
        // Пусть дан произвольный список целых чисел, удалить из него четные числа
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3454);
        list.add(343);
        list.add(3567);
        list.add(4737);
        list.add(9667);
        list.add(78);
        list.add(43);
        list.add(465);
        System.out.println("Initial numbers: " + list);

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) % 2 == 0) {
                list.remove(i);
                i--;
            }
        }

        System.out.println("Only odd numbers: " + list);
    }

    static void ex02() {
        // Задан целочисленный список ArrayList. Найти минимальное, максимальное и
        // среднее арифметическое из этого списка. Collections.max()
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(3454);
        list.add(343);
        list.add(3567);
        list.add(4737);
        list.add(9667);
        list.add(78);
        list.add(43);
        list.add(465);
        System.out.println("Initial numbers: " + list);

        int max_number = Collections.max(list);
        System.out.println("Max number is: " + max_number);
        int min_number = Collections.min(list);
        System.out.println("Min number is: " + min_number);

        int summ = 0;
        for (int i = 0; i < list.size(); i++) {
            summ += list.get(i);
        }

        double average_number = (summ / list.size());
        System.out.println("Average number is: " + average_number);
    }

}