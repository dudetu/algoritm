import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

//Алгоритмы.  Дан односвязный список. Характеризуется свойством или блоком
// схемы, наблюдаемой, допустим ли его элементы симметричной последовательности.
// Для решения задач используется стек и очередь. Функция будет возвращать значение true,
// если список является симметричным, false – в данном случае. По общему правилу список
// является симметричным. Поэтому, если список пуст, то возвращаем значение true.
// Для проверки списка симметричности необходимо проверить равенство всех пар элементов,
// равноотстоящих от обнаружения списка. Каждый содержит один элемент из списка первой половины
// и один – из второго. Элементы первой половины последовательно заменяются в свою очередь, второй половины в ст.
// Если количество элементов в списке будет нечетным, то серединный элемент будет симметричен сам себе и не будет
// помещен ни в свою очередь, ни в стеклянный.




public class SymmetricLinkedList {
    public static boolean isSymmetric(ListNode head) {
        if (head == null) {
            return true; // пустой список является симметричным
        }

        int length = getLength(head);
        int mid = length / 2;

        Queue<Integer> queue = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        ListNode current = head;
        for (int i = 0; i < mid; i++) {
            queue.offer(current.val); // добавляем первую половину списка в очередь
            current = current.next;
        }

        if (length % 2 == 1) {
            // пропускаем серединный элемент списка
            current = current.next;
        }

        while (current != null) {
            stack.push(current.val); // добавляем вторую половину списка в стек
            current = current.next;
        }

        while (!queue.isEmpty() && !stack.isEmpty()) {
            // сравниваем элементы из очереди и стека на равенство
            if (!queue.poll().equals(stack.pop())) {
                return false;
            }
        }

        return true;
    }

    private static int getLength(ListNode head) {
        int length = 0;
        ListNode current = head;
        while (current != null) {
            length++;
            current = current.next;
        }
        return length;
    }

    // определение структуры списка
    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int val) {
            this.val = val;
        }
    }
}

