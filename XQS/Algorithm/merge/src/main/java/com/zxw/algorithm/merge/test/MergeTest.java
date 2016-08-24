package com.zxw.algorithm.merge.test;

import com.zxw.algorithm.merge.util.InverseNumberUtil;

/**
 * Created by yunsu on 2016/8/24.
 */
public class MergeTest {


    public static void main(String[] args){
        int [] a=new int[]{10,9,8,5,2,1};
        InverseNumberUtil util=new InverseNumberUtil();
        util.sort(a);
        System.out.println("INVERSE NUMBER: "+util.getInverseNumber());
    }

}
