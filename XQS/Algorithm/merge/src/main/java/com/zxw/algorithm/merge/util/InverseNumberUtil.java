package com.zxw.algorithm.merge.util;

/**
 * Created by yunsu on 2016/8/24.
 */
public class InverseNumberUtil {

    private long inverseNumber=0;

    public long getInverseNumber() {
        return inverseNumber;
    }

    private void mergeArray(int arr[] , int start, int middle, int end ){
        //i is index of lelf array and j is index of right array
        int i=start, j=middle+1;
        //m is end of left array and n is end of right arrsy
        int m=middle, n=end;

        int [] temp=new int[end-start+1];

        // k is index of temp array
        int k=0;


        //merge the left array and right array
        while (i<=m && j<=n){
            if (arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
                inverseNumber+=(m-i+1);
            }
        }
        //add the remain staff of left array to temp array
        while (i<=m){
            temp[k++]=arr[i++];
        }
        //add the remain staff of right array to temp array
        while (j<=n){
            temp[k++]=arr[j++];
        }
        //copy temp array to source array
        for (int index=0;index<k;index++){
            arr[start+index]=temp[index];
        }

    }

    //recursive call the merge sort
    private void mergeSort(int arr[],int start,int end){

        if (start<end){
            int middle=(start+end)/2;

            mergeSort(arr, start, middle);

            mergeSort(arr,middle+1,end);

            mergeArray(arr,start,middle,end);
        }
    }

    //call method
    public void sort(int arr[]){

        if (arr!=null&&arr.length>0){
            mergeSort(arr,0,arr.length-1);
        }
    }

}
