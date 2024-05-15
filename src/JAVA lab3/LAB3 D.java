import java.util.*;

public class TreeMapExample {
    public static void main(String[] args) {
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        // Додавання значень та ключів у TreeMap
        treeMap.put("Ключ 1", 100);
        treeMap.put("Ключ 2", 200);
        treeMap.put("Ключ 3", 300);
        
        System.out.println("Початковий TreeMap: " + treeMap);
        
        String keyToBind = "Новий ключ";
        int valueToBind = 500;
        
        // Зв’язування значення з ключем
        treeMap.put(keyToBind, valueToBind);
        
        System.out.println("TreeMap після зв'язування: " + treeMap);
    }
}
