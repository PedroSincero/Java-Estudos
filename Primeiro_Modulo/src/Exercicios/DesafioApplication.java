package Exercicios;

import java.util.ArrayList;
import java.util.List;

public class DesafioApplication {
    public static List<Integer> fibonacci()  {
        int limite = 350;
        int i;
        List<Integer> list = new ArrayList<Integer>();
        for (i=0; i<limite; i++) {

            if(list.size() > 1) {
                int last = list.get(list.size() -1);
                int current = list.get(list.size() -2);
                list.add(current + last);
            }else if (list.size() < 1) {
                list.add(0);
            }else {
                list.add(list.get(0) +1);
            }
            if (list.get(list.size() -1) > 377) {
                list.remove(list.size() -1);
                break;
            }
        }
        return list;
    }

    public static boolean isFibonacci(Integer value) {
        return fibonacci().contains(value);
    }
}