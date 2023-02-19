package algoritm;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//Проверка, является ли N средним 1. Если да, то выводим YES, так как 2^0 = 1.
//Проверяем, является ли N четным. Если нет, то выводим НЕТ, так как степень двойки не может быть нечетной.
//Если N четное, то делим его на 2 и переходим к шагу 2. Повторяем это до тех пор, пока не испытываем 1 или не обнаруживаем, что N нечетное.
//Если на каком-то определенном шаге N будет получено значение 1, то выводим YES, так как N было получено двойки.
// Если в результате деления получается нечетное число, то выводим NO, так как N не возникает двойки.


        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        while (n % 2 == 0 && n > 1) {
            n /= 2;
        }

        if (n == 1) {
            System.out.println("YES");
        } else {
            System.out.println("NO");

        }


        //Дано натуральное число N.Вычислите сумму его цифр .
        // При решении этой задачи нельзя использовать списки, таблицы, массивы и циклы.
        //Алгоритм рекурсивного подсчета сумм чисел:
        //
        //Базовый случай: если число N меньше 10, то его сумма равна максимальному количеству.
        // В этом случае возвращаем Н.
        //Рекурсивный случай: вычисляем количество цифр N этой последней цифры,
        // вызывая ту же функцию. Затем добавочные максимальные цифры N к полученной сумме и возвращаемому результату.

        int N = 12345;
        int sum = sumOfDigits(N);
        System.out.println(sum);
    }

    private static int sumOfDigits(int n) {
        if (n < 10) {
            return n;
        } else {
            int sum = sumOfDigits(n / 10);
            int lastDigit = n % 10;
            return sum + lastDigit;
        }
    }

       //рекурсивный метод, который выводит на экран числа чисел Фибоначчи до N-го єлемента

  //  В этой функции использования fibonacci рекурсивно вычисляется число Фибоначчи для заданного индекса n.
    //  Если n равно 0 или 1, то мы возвращаем n(потому что 0-е и 1-е числа Фибоначчи соответственно 0 и 1).
    //  В случае возникновения мы вычисляем n-е число Фибоначчи, вызывая для этого fibonacci(n-1)и fibonacci(n-2)складывая их.

  //  В функции main мы вызываем fibonacci(i)для каждого значения iот 0 до n-1,
    //  и выводим результат на экран. Таким образом, на экране вы заняли Фибоначчи до n-1-го элемента.

     //       int n = 10;
      //      for (int i = 0; i < n; i++) {
      //          System.out.print(fibonacci(i) + " ");
      //      }


        private static int fibonacci(int n) {
            if (n == 0 || n == 1) {
                return n;
            } else {
                return fibonacci(n - 1) + fibonacci(n - 2);
            }




            //Рекурсивный метод, который вызывает ,является ли строка палиндромом
        //    String s2 = "hello";
         //   String s1 = "racecar";
         //   System.out.println(isPalindrome(s1)); // true
          //  System.out.println(isPalindrome(s2)); // false


         //В этой функции проявления Palindrome рекурсивно проявляется, является ли строка  c палиндромом.
            // Если длина строки меньше или равна 1, то строка является палиндромом
            // (потому что строка из одного символа всегда является палиндромом).
            // Если первый и последний символы не совпадают, то строка не является палиндромом.
            // В случае необходимости мы вызываем Palindrome для подстроки,
            // которая не включает первые и последние символы.
            //
            //В функции main мы проверяем работу Palindrome двух примеров строк ( racecarи hello).
            // Первая строка является палиндромом, вторая - нет.
        }
                private static boolean isPalindrome(String s) {
                    if (s.length() <= 1) {
                        return true;
                    } else if (s.charAt(0) != s.charAt(s.length()-1)) {
                        return false;
                    } else {
                        String subString = s.substring(1, s.length()-1);
                        return isPalindrome(subString);
                    }
                }
            }





















       // Рекурсивный метод, который вызывает ,является ли строка палиндромом
       // Вот пример рекурсивного метода  который, как предполагается, является ли строкой палиндрома



