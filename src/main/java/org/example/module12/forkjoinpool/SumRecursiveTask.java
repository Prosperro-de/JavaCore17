package org.example.module12.forkjoinpool;

import java.util.List;
import java.util.concurrent.RecursiveTask;

public class SumRecursiveTask extends RecursiveTask<Integer> {
    List<Integer> integers;

    public SumRecursiveTask(List<Integer> integers) {
        this.integers = integers;
    }

    @Override
    protected Integer compute() {
        if (integers.size() == 1) {
            return integers.get(0);
        }
        int middleIndex = integers.size() / 2;
        SumRecursiveTask left = new SumRecursiveTask(integers.subList(0 , middleIndex));
        SumRecursiveTask right = new SumRecursiveTask(integers.subList(middleIndex , integers.size()));

        left.fork();
        right.fork();

        return left.join() + right.join();
    }
}
