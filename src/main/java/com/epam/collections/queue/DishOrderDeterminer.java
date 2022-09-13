package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class DishOrderDeterminer {
    public List<Integer> determineDishOrder(int numberOfDishes, int everyDishNumberToEat) {
        Queue<Integer> queue = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 1; i <= numberOfDishes; i++) {
            queue.add(i);
        }

        while (!queue.isEmpty()) {
            for (int i = 0; i < everyDishNumberToEat - 1; i++) {
                queue.add(queue.poll());
            }
            answer.add(queue.poll());
        }
        return answer;
    }
}
