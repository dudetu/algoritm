import java.util.Arrays;


public class SortedArray {

    public static void main(String[] args) {
        System.out.println("Hello world!");

        //Имея два отсортированных массива размера m и,
        // соответственно, вам необходимо найти элемент,
        // который будет находиться на k-й позиции в конечном отсортированном массиве.
        // Массив 1 - 100 112 256 349 770
        // Массив 2 - 72 86 113 119 265 445 892
        // к = 7
        // Вывод : 256

        //Алгоритм нахождения k-го элемента в объединенном отсортированном массиве:
        //
        //Создать новый массив размера m+n и собрать в него элементы массива.
        //Отсортировать новый массив (например, с помощью быстрой сортировки).
        //Вывести элемент, который находится на k-й позиции в отсортированном массиве.



                int[] array1 = {100, 112, 256, 349, 770};
                int[] array2 = {72, 86, 113, 119, 265, 445, 892};
                int k = 7;
                int[] mergedArray = mergeArrays(array1, array2);
                Arrays.sort(mergedArray);
                int result = mergedArray[k-1];
                System.out.println("Элемент на " + k + "-й позиции в объединенном отсортированном массиве: " + result);
            }

            private static int[] mergeArrays(int[] array1, int[] array2) {
                int[] mergedArray = new int[array1.length + array2.length];
                int i = 0, j = 0, k = 0;
                while (i < array1.length && j < array2.length) {
                    if (array1[i] < array2[j]) {
                        mergedArray[k++] = array1[i++];
                    } else {
                        mergedArray[k++] = array2[j++];
                    }
                }
                while (i < array1.length) {
                    mergedArray[k++] = array1[i++];
                }
                while (j < array2.length) {
                    mergedArray[k++] = array2[j++];
                }
                return mergedArray;
            }
        }


     //Алгоритм нахождения отсортированной строки:
//
//Разделяем статью на две части.
//Рекурсивно вызываем этот алгоритм для каждой части.
//Сливаем две отсортированные части в одну отсортированную массу.




