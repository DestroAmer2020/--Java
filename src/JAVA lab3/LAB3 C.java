import java.util.*;

public class ArrayComparison {
    public static void main(String[] args) {
        // Перша матриця
        int[][] matrix1 = {{1, 2, 3}, {4, 5, 6}};
        
        // Друга матриця
        int[][] matrix2 = {{1, 2, 3}, {4, 5, 6}};
        
        boolean isEqual = Arrays.deepEquals(matrix1, matrix2);
        
        if (isEqual) {
            System.out.println("Матриці однакові.");
        } else {
            System.out.println("Матриці відмінні.");
        }
    }
}
