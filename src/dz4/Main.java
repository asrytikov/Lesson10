package dz4;

//Напишите метод, который добавляет 500 000 элементов в ArrayList и LinkedList и измерьте время,
// которое потрачено на это. Сравните результаты.
//Help1: long startTime = System.currentTimeMillis();
//Напишите еще один метод, который выбирает из заполненного списка элемент наугад 50 000 раз и
// измерьте время, которое потрачено на это. Сравните результаты.

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        getTime(new ArrayList());
        getTime(new LinkedList());
    }

    public static void getTime(List list){
        list = insert500(list);
        Date curTime = new Date();
        long startTime = System.currentTimeMillis();
        get50000(list);
        Date nTime = new Date();
        long endTime = System.currentTimeMillis();
        long msTime = nTime.getTime() - curTime.getTime();
        long resTime = endTime - startTime;

        System.out.println("Result:" + msTime);
        System.out.println("Result 2: " + resTime);
    }

    public static List insert500(List list){
        for (int i = 0; i < 500_000; i++){
            list.add(new Object());
        }
        return list;
    }

    public static void get50000(List list){
        for (int i = 0; i < 50_000; i++){
            int index = (int)(Math.random()*500000);
            list.get(index);
        }
    }

}
