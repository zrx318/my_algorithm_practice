package com.rongxin.tooffer;

import java.util.ArrayList;
import java.util.concurrent.*;

/**
 * 输入n个整数，找出其中最小的K个数。
 * 例如输入4,5,1,6,2,7,3,8这8个数字，则最小的4个数字是1,2,3,4,。
 */
public class Solution28 {

    public static void main(String[] args) throws Exception {
        ExecutorService executor = Executors.newFixedThreadPool(4);

        FutureTask<Integer> f1 = new FutureTask(() -> {
            Thread.currentThread().sleep(1000 * 3);

            return 1;
        });
        FutureTask<Integer> f2 = new FutureTask(() -> {
            f1.run();
            int f1v = f1.get();
            return f1v + 1;
        });

        executor.submit(f2);

        System.out.println(f2.get());
        System.out.println(f1.get());
    }

    public ArrayList<Integer> GetLeastNumbers_Solution(int[] input, int k) {


        return null;
    }
}
