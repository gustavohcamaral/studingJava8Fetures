import java.util.Arrays;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        testMethod();
    }
    public static void testMethod(){
        List<String> list = Arrays.asList("franz", "ferdinand", "fiel", "vom", "pferd");
        list.stream()
                .filter(name -> name.startsWith("f")) //filtra os nomes que começam com a letra f
                .map(String::toUpperCase) //converte para maiuscula
                .sorted() //ordena alfabeticamente
                .forEach(System.out::println); //imprime no terminal

        List<String> myList = Arrays.asList("k1", "l1", "m2", "m3", "j4", "j4", "j1", "m1");

        myList.stream()
                .filter(s -> s.endsWith("1"))
                .sorted()
                .forEach(System.out::println);

        myList.containsAll()
    }


}
