package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> gameDeck=new ArrayDeque<>();

        gameDeck.add(firstQueue.poll());
        gameDeck.add(firstQueue.poll());
        gameDeck.add(secondQueue.poll());
        gameDeck.add(secondQueue.poll());
        while(!firstQueue.isEmpty() && !secondQueue.isEmpty()){
            firstQueue.offer(gameDeck.removeLast());
            gameDeck.add(firstQueue.poll());
            gameDeck.add(firstQueue.poll());
            secondQueue.offer(gameDeck.removeLast());
            gameDeck.add(secondQueue.poll());
            gameDeck.add(secondQueue.poll());
        }
        return gameDeck;
    }
}
