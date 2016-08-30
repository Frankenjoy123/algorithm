package com.zxw.algorithm.merge.test;

import com.zxw.algorithm.merge.util.InverseNumberUtil;
import com.zxw.algorithm.util.FileUtil;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by yunsu on 2016/8/24.
 */
public class MergeTest {


    public static void main(String[] args){
//        test1();
        test2();
    }

    private static void test1() {
        int [] a=new int[]{10,9,8,5,2,1};
        InverseNumberUtil util=new InverseNumberUtil();
        util.sort(a);
        System.out.println("INVERSE NUMBER: "+util.getInverseNumber());
    }

    private static void test2(){
        int[] a= FileUtil.readFileToArr("E:\\Dropbox\\_bcb5c6658381416d19b01bfc1d3993b5_IntegerArray.txt");
        InverseNumberUtil util=new InverseNumberUtil();
        util.sort(a);
        System.out.println("INVERSE NUMBER: "+util.getInverseNumber());
    }



}
