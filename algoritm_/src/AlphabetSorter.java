public class AlphabetSorter {


public static void main(String[] args) {
    ////Расставьте в алфавитном порядке буквы.
    //// Разрешается использование техники Разделяй и властвуй.
    //// Полученные данные напечатайте.
    // На вход строка: "poiuytrewqlkjhgfdsamnbvcxz"
    ////На выходе должно быть: ABCDEFGHIJKLMNOPQRSTUVWXY
}
    String str = "poiuytrewqlkjhgfdsamnbvcxz";
    String sortedStr = sortAlphabet(str);

    {
        System.out.println(sortedStr);
    }

    public static String sortAlphabet(String str) {
        if (str.length() <= 1) {
            return str.toUpperCase();
        } else {
            String leftStr = str.substring(0, str.length() / 2);
            String rightStr = str.substring(str.length() / 2);
            String sortedLeftStr = sortAlphabet(leftStr);
            String sortedRightStr = sortAlphabet(rightStr);
            return merge(sortedLeftStr, sortedRightStr);
        }
    }
    public static String merge(String leftStr, String rightStr) {
        StringBuilder mergedStr = new StringBuilder();
        int i = 0;
        int j = 0;
        while (i < leftStr.length() && j < rightStr.length()) {
            if (leftStr.charAt(i) < rightStr.charAt(j)) {
                mergedStr.append(leftStr.charAt(i));
                i++;
            } else {
                mergedStr.append(rightStr.charAt(j));
                j++;
            }
        }
        while (i < leftStr.length()) {
            mergedStr.append(leftStr.charAt(i));
            i++;
        }
        while (j < rightStr.length()) {
            mergedStr.append(rightStr.charAt(j));
            j++;
        }
        return mergedStr.toString().toUpperCase();
    }
}

//В методе main мы создаем объект класса AlphabetSorter,
// чтобы вызвать его метод sortAlphabet и передать ему строку,
// которую нужно отсортировать в алфавитном порядке.
//В методе sortAlphabet мы используем метод "Разделяй и властвуй".
// Если длина строки меньше или равна 1, то мы просто возвращаем ее в верхнем регистре.
// В противном случае мы делим строку на две части и рекурсивно вызываем sortAlphabet для каждой части.
// Затем мы объединяем отсортированные части с помощью метода merge.
//В методе merge мы сравниваем буквы в левой и правой частях строки. Если левая буква меньше, то мы добавляем ее в новую строку и переходим к следующей букве в левой части. Если правая буква меньше, то мы добавляем ее в новую строку и переходим к следующей букве в правой части. Мы продолжаем делать это до тех пор, пока не достигнем конца хотя бы одной из частей. Затем мы добавляем оставшиеся буквы из левой и правой частей в новую строку и возвращаем эту строку в верхнем регистре.