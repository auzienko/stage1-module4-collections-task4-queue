package com.epam.collections.queue;

import java.util.*;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Deque<Integer> dishes = new LinkedList<>();
        for (int i = 1; i <= numberOfDishes; ++i) {
            dishes.add(i);
        }
        int steps = 0;
        List<Integer> resultList = new ArrayList<>();
        while (!dishes.isEmpty()) {
            if (++steps % everyDishNumberToEat == 0) {
                resultList.add(dishes.pollFirst());
            } else {
                Integer j = dishes.pollFirst();
                dishes.addLast(j);
            }
        }
        return resultList;
    }
}
