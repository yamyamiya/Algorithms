public class Homework4 {
    public static void main(String[] args) {
//  Имея два отсортированных массива размера m и n соответственно, вам нужно найти элемент,
//  который будет находиться на k-й позиции в конечном отсортированном массиве.
//
//Массив 1 - 100 112 256 349 770
//Массив 2 - 72 86 113 119 265 445 892
//к = 7
//Вывод : 256
//
//
//Окончательный отсортированный массив -
//72, 86, 100, 112, 113, 119, 256, 265, 349, 445, 770, 892
//7-й элемент этого массива равен 256.

        int[] array1 = {100, 112, 256, 349, 770};
        int[] array2 = {72, 86, 113, 119, 265, 445, 892};
        int k = 0;
        System.out.println("Элемент с индексом " + k+ ": "+ findElement(array1, array2, k));
    }

            public static int findElement(int[] array1, int[] array2, int k) {
                int i = 0;
                int j = 0;
                int count = 0;

                while (i < array1.length && j < array2.length) {
                    if (array1[i] < array2[j]) {
                        if (count == k) {
                            return array1[i];
                        }
                        count++;
                        i++;

                    } else {
                        if (count == k) {
                            return array2[j];
                        }
                        count++;
                        j++;
                    }
                }

                while (i < array1.length) {
                    if (count == k) {
                        return array1[i];
                    }
                    count++;
                    i++;
                }

                while (j < array2.length) {
                    if (count == k) {
                        return array2[j];
                    }
                    count++;
                    j++;
                }

                return -1;
            }
}



