import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Integer> lista_elemente = new ArrayList<>();
        lista_elemente.add(5);
        lista_elemente.add(10);
        lista_elemente.add(5132);
        lista_elemente.add(5112);
        lista_elemente.add(215);
        int sum_of_elements = 0;
        for (int element : lista_elemente) {
            sum_of_elements = sum_of_elements + element;
        }
        System.out.println(sum_of_elements);
    }


}
