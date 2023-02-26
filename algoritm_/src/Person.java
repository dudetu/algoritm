public class Person {

    //Дан массив объектов типа Person,
    // который содержит поля name (тип String) и age (тип int).
    // Необходимо отсортировать этот массив по возрасту в порядке убывания,
    // используя алгоритм Merge sort.

    //Этот код использует класс Person для представления объектов в массиве.
    // Функция mergeSort() рекурсивно вызывается для левой и правой половин массива,
    // затем функция merge() используется для слияния двух отсортированных половин в один отсортированный массив.
    //
    //Результатом выполнения программы будет отсортированный список по возрасту в порядке убывания:

        private String name;
        private int age;

        public Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        public String getName() {
            return name;
        }

        public int getAge() {
            return age;
        }
    }
class Main {
    public static void main(String[] args) {
        Person[] people = {
                new Person("Alice", 25),
                new Person("Bob", 20),
                new Person("Charlie", 30),
                new Person("David", 35),
                new Person("Eve", 28)
        };

        mergeSort(people, 0, people.length - 1);

        for (Person person : people) {
            System.out.println(person.getName() + " " + person.getAge());
        }
    }

    public static void mergeSort(Person[] people, int left, int right) {
        if (left < right) {
            int mid = (left + right) / 2;
            mergeSort(people, left, mid);
            mergeSort(people, mid + 1, right);
            merge(people, left, mid, right);
        }
    }

    public static void merge(Person[] people, int left, int mid, int right) {
        Person[] temp = new Person[right - left + 1];
        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (people[i].getAge() >= people[j].getAge()) {
                temp[k] = people[i];
                i++;
            } else {
                temp[k] = people[j];
                j++;
            }
            k++;
        }

        while (i <= mid) {
            temp[k] = people[i];
            i++;
            k++;
        }

        while (j <= right) {
            temp[k] = people[j];
            j++;
            k++;
        }

        for (k = 0; k < temp.length; k++) {
            people[left + k] = temp[k];
        }
    }
    }



