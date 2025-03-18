package maopao;

import maopao.impl.MaoPaoSortImpl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class TestSort {



    public static void main(String[] args) {
        MaoPaoSort maoPaoSort =  new MaoPaoSortImpl();

        List<Integer> randomList = new ArrayList<>();
        Random rand = new Random();
        for (int i = 0; i < 100; i++) {
            int randomNum = rand.nextInt(10001);
            randomList.add(randomNum);
        }
        System.out.println(randomList.toString());


        // 排序
        List<Integer> sortedList = maoPaoSort.sort(randomList);
        System.out.println(sortedList.toString());
    }

}
