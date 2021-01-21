package examples;

import java.util.ArrayList;

public class BetterArrayList extends ArrayList {

    public static void print(ArrayList list) {
        for (Object listItem : list) {
            System.out.println(listItem);
        }
    }

    public static Object pop(ArrayList list) {
        int lastIndex = list.size() - 1;
        return list.get(lastIndex);
    }

    public static void main(String[] args) {
        BetterArrayList list = new BetterArrayList();
        list.add("Today");
        list.add("is");
        list.add("the");
        list.add("Presidential");
        list.add("Election");
        list.add("Day");

        print(list);
        System.out.println(pop(list));

        BetterArrayList secondList = new BetterArrayList();
        secondList.add(1);
        secondList.add(33);
        secondList.add(345);
        secondList.add(345);
        secondList.add(12);

        print(secondList);
        System.out.println(pop(secondList));

    }
}
