package lesson11;

import java.util.ArrayList;
import java.util.Arrays;

public class Homework10 {

//    У вас есть список активностей, каждая из которых имеет начальное и конечное время.
//    Ваша цель - выбрать максимальное количество неперекрывающихся активностей.
//
//    Напишите функцию maxActivities(activities), которая принимает список активностей.
//    Каждая активность представлена в виде кортежа (начало, конец).
//    Функция должна вернуть список индексов выбранных активностей.
//
//    Функция должна выбирать активности таким образом,
//    чтобы ни одна из выбранных активностей не перекрывалась по времени,
//    и при этом максимизировать общее количество выбранных активностей.
    
//    Пример:
//    activities = [(1, 4), (3, 5), (0, 6), (5, 7), (3, 8), (5, 9), (6, 10), (8, 11)]
//    print(maxActivities(activities))  # Результат: [0, 3, 7]

    public static void main(String[] args) {
        int[][] activities = {
                {1, 4}, {1, 5}, {3, 5}, {4, 6}, {4, 8}, {6, 9}, {10, 12}
        };
        for (int[] act : maxActivities(activities)) {
            System.out.println(Arrays.toString(act));
        }
    }

    public static ArrayList<int[]> maxActivities(int[][] arr) {
        Arrays.sort(arr, (a, b) -> Integer.compare(a[1], b[1]));
        ArrayList<int[]> picked = new ArrayList<>();
        picked.add(arr[0]);
        int end = arr[0][1];
        for (int[] act : arr) {
            if (act[0] >= end) {
                picked.add(act);
                end = act[1];
            }
        }
        return picked;

    }
}
