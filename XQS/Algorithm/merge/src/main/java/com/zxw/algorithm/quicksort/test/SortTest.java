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
        test1("E:\\Dropbox\\10.txt");

        test1("E:\\Dropbox\\_32387ba40b36359a38625cbb397eee65_QuickSort.txt");

    }

    private static void test1(String path) {
        int[] a= FileUtil.readFileToArr(path);
        int[] b= a.clone();
        int[] c=a.clone();
        System.out.println("size: "+a.length);


        System.out.print("source a[]:");
//        for (int i: a){
//            System.out.print(i + ",");
//        }
        System.out.println();
        QuickSort util=new QuickSortLeftPivotImpl();
        util.quickSortMethod(a);
        System.out.println("compare count with left pivot: "+util.getCompareCount());
        System.out.print("result a[]:");
//        for (int i: a){
//            System.out.print(i + ",");
//        }
        System.out.println();
        System.out.println();


        System.out.print("source b[]:");
//        for (int i: b){
//            System.out.print(i + ",");
//        }
        System.out.println();
        QuickSort util2=new QuickSortRightPivotImpl();
        util2.quickSortMethod(b);
        System.out.println("compare count with right pivot: "+util2.getCompareCount());
        System.out.print("result b[]:");
//        for (int i: b){
//            System.out.print(i + ",");
//        }
        System.out.println();
        System.out.println();


        System.out.print("source c[]:");
//        for (int i: c){
//            System.out.print(i + ",");
//        }
        System.out.println();
        QuickSort util3=new QuickSortMedianOfThreeImpl();
        util3.quickSortMethod( c);
        System.out.println("compare count with three of middle pivot: "+util3.getCompareCount());
//        for (int i: c){
//            System.out.print(i+",");
//        }
        System.out.println();

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
