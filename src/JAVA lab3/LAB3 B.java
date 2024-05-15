import java.util.*;

public class LinkedListTraversal {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<>();
        linkedList.add("Елемент 1");
        linkedList.add("Елемент 2");
        linkedList.add("Елемент 3");
        linkedList.add("Елемент 4");
        linkedList.add("Елемент 5");
        
        System.out.println("Початковий зв'язаний список: " + linkedList);
        
        int startingIndex = 2; // Починаємо з третього елемента (індекс 2)
        
        // Перебір елементів починаючи зі зазначеної позиції
        ListIterator<String> iterator = linkedList.listIterator(startingIndex);
        while(iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}
