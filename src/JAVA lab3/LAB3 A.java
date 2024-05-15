import java.util.*;

public class LinkedListExample {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");
        
        System.out.println("Початковий зв'язаний список: " + linkedList);
        
        // Видалення першого елемента
        linkedList.removeFirst();
        
        // Видалення останнього елемента
        linkedList.removeLast();
        
        System.out.println("Зв'язаний список після видалення: " + linkedList);
    }
}