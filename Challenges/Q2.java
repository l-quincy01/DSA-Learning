import java.util.*;

public class Q2 {

    public static boolean matrixCheck(int[][] matrix) {

        List<Integer> one_to_n = new ArrayList<>();

        for (int q = 1; q <= matrix.length; q++) {
            one_to_n.add(q);
        }

        // row travesal
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                if (!one_to_n.contains(matrix[i][j])) {
                    return false;
                }
            }
        }
        // column traversal
        for (int j = 0; j < matrix[0].length; j++) {
            for (int i = 0; i < matrix.length; i++) {
                if (!one_to_n.contains(matrix[i][j])) {
                    return false;
                }
            }
        }

        return true;

    }

    public static void main(String[] args) {

        int[][] matrix = new int[][] { { 1, 2, 3 }, { 3, 1, 2 }, { 2, 3, 1 } };
        System.out.println(matrixCheck(matrix));
    }

}

/*
 * 
 * // Online Java Compiler
 * // Use this editor to write, compile and run your Java code online
 * import java.util.* ;
 * class Main {
 * 
 * 
 * 
 * }
 * 
 */
