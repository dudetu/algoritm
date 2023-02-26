import java.util.Arrays;

public class MergeSort {
    //У вас есть список из n элементов, которые представляют собой оценки студентов по математике.
    // Вам нужно отсортировать этот список в порядке убывания оценок с использованием алгоритма сортировки Merge sort.
    //Для решения этой задачи напишите функцию, которая принимает на вход список оценок и возвращает новый список,
    // отсортированный в порядке убывания.
    //{ 3, 8, 1, 9, 4, 2, 7, 6, 5 };
    //Результатом работы программы будет список оценок,
    // отсортированный в порядке убывания: [9, 8, 7, 6, 5, 4, 3, 2, 1].

        public static void main(String[] args) {

            int[] arr = { 3, 8, 1, 9, 4, 2, 7, 6, 5 };
            mergeSort(arr, 0, arr.length - 1);
            System.out.println(Arrays.toString(arr));
        }

        public static void mergeSort(int[] arr, int left, int right) {
            if (left < right) {
                int middle = (left + right) / 2;
                mergeSort(arr, left, middle);
                mergeSort(arr, middle + 1, right);
                merge(arr, left, middle, right);
            }
        }

        public static void merge(int[] arr, int left, int middle, int right) {
            int[] tempArr = new int[right - left + 1];
            int i = left, j = middle + 1, k = 0;
            while (i <= middle && j <= right) {
                if (arr[i] >= arr[j]) {
                    tempArr[k++] = arr[i++];
                } else {
                    tempArr[k++] = arr[j++];
                }
            }
            while (i <= middle) {
                tempArr[k++] = arr[i++];
            }
            while (j <= right) {
                tempArr[k++] = arr[j++];
            }

            for (i = left; i <= right; i++) {
                arr[i] = tempArr[i - left];
            }


        }
    }

