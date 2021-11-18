
// Problem link - https://www.geeksforgeeks.org/rearrange-array-alternating-positive-negative-items-o1-extra-space/

package com.company.Arrays;

import java.util.Arrays;

public class Alternate_positive_Negative
{
    // function to right rotate an array
    public static void rightRotate(int arr[] , int start , int end) {
        int temp = arr[end];

        for (int i = end; i > start; i--)
        {
            arr[i] = arr[i-1];
        }
        arr[start] = temp;
    }

    public static void rearrange(int [] arr)
    {
        int wrongIndex = -1;

        for (int i=0 ; i< arr.length-1 ; i++)
        {
            if (wrongIndex != -1)
            {
                // check if the value's have opposite signs
                if (arr[wrongIndex] >= 0 && arr[i]<0 || (arr[wrongIndex]<0 && arr[i] >= 0))
                {
                    rightRotate(arr, wrongIndex,i);

                    if (i - wrongIndex >= 2)
                        wrongIndex += 2;
                    else
                        wrongIndex = -1;
                }
            }

            else
            //check the wrong conditions
            {
                if ((arr[i] <0 && i%2 == 1) || (arr[i] >= 0 && i%2 == 0))
                {
                    // it means i is the wrong index because at odd index it have -ve value or at even index it have +ve
                    wrongIndex = i;
                }
            }
        }
    }


    public static void main(String[] args) {
        int arr[] = {1, 2, 3, -4, -1, 4};
        System.out.println(Arrays.toString(arr));

        rearrange(arr);

        System.out.println(Arrays.toString(arr));


    }


}
