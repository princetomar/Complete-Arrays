// Problem link - https://practice.geeksforgeeks.org/problems/inversion-of-array-1587115620/1

package com.company.Arrays;

public class Count_inversions_14
{
    public static int countInversions(int arr[])
    {
        if (arr.length <= 1)
            return 0;

        int inversions = 0;
        int i=0;
        while (i < arr.length-1)
        {
            if (arr[i] < arr[i+1])
            {
                inversions++;
                i++;
            }
            else if(arr[i] == arr[i+1])
                i++;
        }
        return inversions;
    }

    public static void main(String[] args) {
        int arr[] = {2, 4, 1, 3, 5};

        System.out.println("Inversions : "+ countInversions(arr));
    }
}
