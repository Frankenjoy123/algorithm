package com.zxw.algorithm.quicksort.test;

import com.zxw.algorithm.quicksort.util.QuickSort;
import com.zxw.algorithm.quicksort.util.QuickSortLeftPivotImpl;
import com.zxw.algorithm.quicksort.util.QuickSortMedianOfThreeImpl;
import com.zxw.algorithm.quicksort.util.QuickSortRightPivotImpl;
import com.zxw.algorithm.util.FileUtil;

/**
 * Created by yunsu on 2016/8/30.
 */
public class SortTest {


    public static void main(String[] args){
        test2();
    }



    private static void test2(){
        int[] a= FileUtil.readFileToArr("E:\\Dropbox\\_32387ba40b36359a38625cbb397eee65_QuickSort.txt");
        QuickSort util=new QuickSortLeftPivotImpl();
        util.quickSortMethod(a);
        System.out.println("compare count with left pivot: "+util.getCompareCount());

        int[] b= FileUtil.readFileToArr("E:\\Dropbox\\_32387ba40b36359a38625cbb397eee65_QuickSort.txt");
        QuickSort util2=new QuickSortRightPivotImpl();
        util2.quickSortMethod(b);
        System.out.println("compare count with right pivot: "+util2.getCompareCount());

        int[] c= FileUtil.readFileToArr("E:\\Dropbox\\_32387ba40b36359a38625cbb397eee65_QuickSort.txt");
        QuickSort util3=new QuickSortMedianOfThreeImpl();
        util2.quickSortMethod( c);
        System.out.println("compare count with right pivot: "+util3.getCompareCount());

    }


}
