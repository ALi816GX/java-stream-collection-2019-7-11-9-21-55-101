package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.sql.Array;
import java.util.*;
import java.util.stream.Collectors;

public class CollectionOperator {
    public List<Integer> getListByInterval(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = Math.min(left,right);i <= Math.max(left,right);i++){
            list.add(i);
        }
        if(left>right){
            Collections.reverse(list);
        }

        return list;
    }

    public List<Integer> getEvenListByIntervals(int left, int right) {
        List<Integer> list = new ArrayList<>();
        for(int i = Math.min(left,right);i <= Math.max(left,right);i++){
            if(i%2==0) {
                list.add(i);
            }
        }
        if(left>right){
            Collections.reverse(list);
        }

        return list;
    }

    public List<Integer> popEvenElments(int[] array) {
        List<Integer> list = new ArrayList<>();
        for (int x:array){
            if(x%2==0){
                list.add(x);
            }
        }
        return list;
    }


    public int popLastElment(int[] array) {
       return array.length!=0?array[array.length-1]:0;
    }

    public List<Integer> popCommonElement(int[] firstArray, int[] secondArray) {
        throw new NotImplementedException();
    }

    public List<Integer> addUncommonElement(Integer[] firstArray, Integer[] secondArray) {
        throw new NotImplementedException();
    }
}
