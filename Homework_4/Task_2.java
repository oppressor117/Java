package Homework_4;
import java.util.LinkedList;
public class Task_2 {
    public static void main(String[] args) {
        LinkedList<Integer> elem = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            enqueue(elem, getRandomNumber()); //заполняем случайными числами
        }
        System.out.println(elem);

        System.out.println(dequeue(elem)); // удалили первый элемент
        System.out.println(elem);

        System.out.println(first(elem)); // вывели первый элемент
        System.out.println(elem); 
    }

    public static void enqueue(LinkedList<Integer> elem, int num) {// помещает элемент в конец очереди
        elem.addLast(num);
    }

    public static int dequeue(LinkedList<Integer> elem) { // возвращает первый элемент из очереди и удаляет его
        int num = elem.get(0);
        elem.remove(0);
        return num;
    }

    public static int first(LinkedList<Integer> elem) { // возвращает первый элемент из очереди, не удаляя
        int num = elem.get(0);
        return num;
    }

    public static int getRandomNumber() { // генерирует случайное число
        double x = (Math.random() * 99);
        int num = (int) x;
        return num;
    }
}
