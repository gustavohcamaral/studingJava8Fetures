import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Consumer;

public class StringSort {
    public static void main(String[] args) {
        List<String> word = new ArrayList<>();
        word.add("Alura Online");
        word.add("Editora Casa do Código");
        word.add("Caelum");

        Collections.sort(word);
        System.out.println(word);
        //
        Comparator<String> comparator = new ComparatorByLength();
        Collections.sort(word, comparator);
        System.out.println(word);
        //
        word.sort(comparator);
        System.out.println(word);
        //
        for (String w : word) {
            System.out.println(w);
        }
        //
        Consumer<String> consumer = new PrintInLine();
        word.forEach(consumer);
        //
        Consumer<String> consumer2 = new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        word.forEach(consumer2);
        //
        word.forEach(new Consumer<String>() {

            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        });
        //
        word.forEach((String s) -> {
                    System.out.println(s);
                }
        );
        //
        word.forEach(s -> System.out.println(s));
        //
        word.sort((s1, s2) -> {
            if (s1.length() < s2.length())
                return -1;
            if (s1.length() > s2.length())
                return 1;
            return 0;
        });
        word.forEach(s -> System.out.println(s));
        //
        word.sort((s1, s2) -> {
            return Integer.compare(s1.length(), s2.length());
        });
        word.forEach(s -> System.out.println(s));
        //
        word.sort((s1, s2) -> Integer.compare(s1.length(), s2.length()));
        word.forEach(s -> System.out.println(s));
        //exercises
        /*
        new Thread(new Runnable() {

            @Override
            public void run() {
                System.out.println("Executing a Runnable");
            }

        }).start();
        new Thread(() -> System.out.println("Executing a Runnable")).start();
         */
        //
        word.sort(Comparator.comparing(s -> s.length()));
        word.forEach(s -> System.out.println(s));
        //
        word.sort(Comparator.comparing(String::length));
        word.forEach(s -> System.out.println(s));
        //
        word.sort(Comparator.comparing(String::length));
        word.forEach(System.out::println);
        /*
        //exercises
        words.sort(Comparator.comparing(s -> s.length()));
        words.sort(Comparator.comparing(String::length));
        words.forEach(System.out::println);
        //
        words.sort(String.CASE_INSENSITIVE_ORDER);
        words.forEach(System.out::println);
         */
        //

    }
}

class PrintInLine implements Consumer<String> {

    @Override
    public void accept(String s) {
        System.out.println(s);
    }
}

class ComparatorByLength implements Comparator<String> {

    @Override
    public int compare(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.length() > s2.length())
            return 1;
        return 0;
    }
}
