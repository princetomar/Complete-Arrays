package com.company.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Chocolate_Distribution
{
    public static long findMinDiff (ArrayList<Long> a, long n, long m)
    {
        // your code here
        Collections.sort(a);
        long minDiff = Long.MAX_VALUE;

        for(int i=0 ; i+m -1 < n ; i++)
        {
            // calculate the difference b/w a[i+m-1] and a[i] index
            // then compare it with minimum difference
            // assign the minimum value among them

            long diff = a.get(i+(int )m-1) - a.get(i);
            minDiff = Math.min(minDiff, diff);
        }

        return minDiff;
    }

    public static void main(String[] args) {
        ArrayList<Long> arr = new ArrayList<Long>();
        arr.add(3L);
        arr.add(4L);
        arr.add(1L);
        arr.add(9L);
        arr.add(56L);
        arr.add(7L);
        arr.add(9L);
        arr.add(12L);
        System.out.println(findMinDiff(arr, arr.size(), 5));
    }
}
