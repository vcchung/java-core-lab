package vc.java.sorting.bubblesort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args){
        int[] res=new BubbleSort().sort(new int[]{5,2,7,8,9,10,2,3,14,16,3});
        for(int i:res){
            System.out.println(i);
        }

    }
}
