package com.company.task70;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        List<Integer> listTemp = new ArrayList<>();
        Integer temp = 1;

        map.put(1, "wefweff");
        map.put(2, "efwewfwfff");
        map.put(3, "fwdbfdbeff");
        map.put(4, "zxcefweff");

        map.entrySet().stream()
                .filter(x -> x.getValue().length() > 5)
                .filter(x -> x.getKey() % 3 == 0)
                .map(x -> listTemp.add(x.getKey()))
                .forEach(System.out::println);

        for (Integer integer : listTemp) {
            temp *= integer;
        }
        System.out.println(temp);




        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            list.add(new Random().nextInt(100) + 1);
        }
        System.out.println(list);

        List<Integer> temList = new ArrayList<>();
        list.stream()
                .map(x -> {
            if (x % 2 != 0){
                temList.add(x + 10);
                    return -1;
            }
            else {
                return x;
            }
        })
                .filter(x -> x % 2 == 0)
                .forEach(System.out::println);
        System.out.println(temList);
    }
}
