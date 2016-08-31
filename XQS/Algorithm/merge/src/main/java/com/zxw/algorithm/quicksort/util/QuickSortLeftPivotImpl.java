package com.zxw.algorithm.quicksort.util;

/**
 * Created by yunsu on 2016/8/30.
 * 选择最左边的数作为pivot
 */
public class QuickSortLeftPivotImpl implements QuickSort{

    private int compareCount=0;

    @Override
    public int getCompareCount() {
        return compareCount;
    }

    /**
     *
     * @param arr
     * @param start
     * @param end
     * @return index of pivot
     */
    private int divide(int arr[] , int start, int end){

            //define pivot
            int x=arr[start];
            int i=start+1;
            int j=start+1;
            while (j<=end){
                if (arr[j]<=x){
                    //swap a[i]  and a[j]
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    i++;
                }
                j++;
            }
            //swap pivot and a[i-1]
            int temp=arr[i-1];
            arr[i-1]=arr[start];
            arr[start]=temp;

            //when there is a recursive call on a subarray of length m, you should simply add m−1 to your running total of comparisons.
            compareCount= compareCount+ (end-start);

            return i-1;
    }

    private void quickSort(int arr[] , int start, int end){
        if (start<end){
            int pivotIndex=divide(arr,start,end);
            quickSort(arr,start,pivotIndex-1);
            quickSort(arr,pivotIndex+1,end);
        }
    }

    @Override
    public void quickSortMethod(int arr[]){
        if (arr!=null &&  arr.length>1){
            quickSort(arr,0,arr.length-1);
        }
    }


}
