package com.zxw.algorithm.merge.util;

/**
 * Created by yunsu on 2016/8/24.
 */
public class InverseNumberUtil {

    private int inverseNumber=0;

    public int getInverseNumber() {
        return inverseNumber;
    }

    private void mergeArray(int arr[] , int start, int middle, int end ){
        //分别对应前一半和后一半数组的开始索引
        int i=start, j=middle+1;
        //分别对应前一半和后一半数组的结束位置
        int m=middle, n=end;

        int [] temp=new int[end-start+1];

        //为temp数组的索引
        int k=0;


        //比较前后两半数组的大小
        while (i<=m && j<=n){
            if (arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
                inverseNumber+=(m-i+1);
            }
        }
        //剩余的前半数组
        while (i<=m){
            temp[k++]=arr[i++];
        }
        //剩余的后半数组
        while (j<=n){
            temp[k++]=arr[j++];
        }
        //将temp数组中的内容复制到arr数组中
        for (int index=0;index<k;index++){
            arr[start+index]=temp[index];
        }

    }

    //递归归并排序
    private void mergeSort(int arr[],int start,int end){

        if (start<end){
            int middle=(start+end)/2;

            mergeSort(arr, start, middle);

            mergeSort(arr,middle+1,end);

            mergeArray(arr,start,middle,end);
        }
    }

    public void sort(int arr[]){

        if (arr!=null&&arr.length>0){
            mergeSort(arr,0,arr.length-1);
        }
    }

}
