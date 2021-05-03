import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> inList = new ArrayList<>(Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4));

        inList.removeIf(element -> element <= 0 | element % 2 != 0);

        Collections.sort(inList);
        System.out.println(inList);
    }
}

//        //хотя вариант с созданием нового листа наверное будет более быстрым с точки зрения алгоритмов.
//        List<Integer> inList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
//        List<Integer> inListPositive = new ArrayList<>();
//
//        for (int i : inList) {
//            if (i > 0 & i % 2 == 0) {
//                inListPositive.add(i);
//            }
//        }
//
//        Collections.sort(inListPositive);
//        System.out.println(inListPositive);
