import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Homework6 {
    public static void main(String[] args) {
        List<Integer> array = Arrays.asList(9,1,0,2,7,6,8,4,5);
        System.out.println(quickSort(array));

    }
    public static List<Integer> quickSort(List<Integer> arr) {
        if (arr.size() <= 1) return arr;
        int pivot = arr.get(arr.size() - 1);
        List<Integer> left = new ArrayList<>();
        List<Integer> right = new ArrayList<>();
        for (int i = 0; i < arr.size() - 1; i++) {
            if (arr.get(i) > pivot)
                right.add(arr.get(i));
            else
                left.add(arr.get(i));
        }
        List<Integer> newArray = new ArrayList<>();
        newArray.addAll(quickSort((left)));
        newArray.add(pivot);
        newArray.addAll(quickSort((right)));
        return newArray;

    }
}
