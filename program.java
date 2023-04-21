import java.util.ArrayList;
import java.util.List;

public class program {
    public static void main(String[] args) {

        ex01();
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

}