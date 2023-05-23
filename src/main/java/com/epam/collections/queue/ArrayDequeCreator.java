package com.epam.collections.queue;

import java.util.ArrayDeque;
import java.util.PriorityQueue;
import java.util.Queue;

public class ArrayDequeCreator extends PriorityQueue<String> {
    public ArrayDeque<Integer> createArrayDeque(Queue<Integer> firstQueue, Queue<Integer> secondQueue) {
        ArrayDeque<Integer> arrayDeque = new ArrayDeque<>();
        toDesk(arrayDeque, firstQueue);
        toDesk(arrayDeque, firstQueue);
        toDesk(arrayDeque, secondQueue);
        toDesk(arrayDeque, secondQueue);

        while (!(firstQueue.isEmpty() && secondQueue.isEmpty())) {
            fromDesk(arrayDeque, firstQueue);
            toDesk(arrayDeque, firstQueue);
            toDesk(arrayDeque, firstQueue);
            fromDesk(arrayDeque, secondQueue);
            toDesk(arrayDeque, secondQueue);
            toDesk(arrayDeque, secondQueue);
        }
        return arrayDeque;
    }

    private void toDesk(ArrayDeque<Integer> arrayDeque, Queue<Integer> playerQueue) {
        if (playerQueue.isEmpty()) {
            return;
        }
        arrayDeque.add(playerQueue.poll());
    }

    private void fromDesk(ArrayDeque<Integer> arrayDeque, Queue<Integer> playerQueue) {
        if (playerQueue.isEmpty()) {
            return;
        }
        playerQueue.add(arrayDeque.pollLast());
    }
}
