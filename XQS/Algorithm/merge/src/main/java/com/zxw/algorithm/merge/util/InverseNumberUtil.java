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
        //�ֱ��Ӧǰһ��ͺ�һ������Ŀ�ʼ����
        int i=start, j=middle+1;
        //�ֱ��Ӧǰһ��ͺ�һ������Ľ���λ��
        int m=middle, n=end;

        int [] temp=new int[end-start+1];

        //Ϊtemp���������
        int k=0;


        //�Ƚ�ǰ����������Ĵ�С
        while (i<=m && j<=n){
            if (arr[i]<arr[j]){
                temp[k++]=arr[i++];
            }else {
                temp[k++]=arr[j++];
                inverseNumber+=(m-i+1);
            }
        }
        //ʣ���ǰ������
        while (i<=m){
            temp[k++]=arr[i++];
        }
        //ʣ��ĺ������
        while (j<=n){
            temp[k++]=arr[j++];
        }
        //��temp�����е����ݸ��Ƶ�arr������
        for (int index=0;index<k;index++){
            arr[start+index]=temp[index];
        }

    }

    //�ݹ�鲢����
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
