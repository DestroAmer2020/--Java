import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.TreeMap;

public class Main {
    public static void main(String[] args) {
        // A
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);
        linkedList.add(40);
        
        System.out.println("Початковий зв'язаний список: " + linkedList);
        
        linkedList.removeFirst();
        linkedList.removeLast();
        
        System.out.println("Зв'язаний список після видалення: " + linkedList);
        
        // B
        LinkedList<String> stringList = new LinkedList<>();
        stringList.add("A");
        stringList.add("B");
        stringList.add("C");
        stringList.add("D");
        
        System.out.println("Початковий зв'язаний список: " + stringList);
        
        int startingIndex = 2;
        ListIterator<String> iterator = stringList.listIterator(startingIndex);
        System.out.println("Елементи починаючи з позиції " + startingIndex + ":");
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        
        // C
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {1, 2, 3, 4, 5};
        int[] array3 = {1, 2, 3, 4};
        
        System.out.println("Чи рівні array1 та array2? " + Arrays.equals(array1, array2));
        System.out.println("Чи рівні array1 та array3? " + Arrays.equals(array1, array3));
        
        // D
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        treeMap.put("One", 1);
        treeMap.put("Two", 2);
        treeMap.put("Three", 3);
        
        System.out.println("Початковий TreeMap: " + treeMap);
        
        String key = "Four";
        int value = 4;
        treeMap.put(key, value);
        
        System.out.println("TreeMap після зв'язування нового значення: " + treeMap);
    }
}