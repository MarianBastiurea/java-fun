package org.example.c06.ArrayList;

import java.util.ArrayList;

public class CopyArrayList {
    public static void main(String[] args){
        ArrayList<Integer> numbers=new ArrayList<>();
        ArrayList<Integer> numbers1=new ArrayList<>();
        for(int i =0; i<10; i++){
            numbers.add(i);
        }
        System.out.println("old ArrayList "+numbers+" ");
        for(Integer element:numbers){
            numbers1.add(numbers.get(element));
        }
        System.out.println("new ArrayList "+ numbers1+" ");
    }
}
