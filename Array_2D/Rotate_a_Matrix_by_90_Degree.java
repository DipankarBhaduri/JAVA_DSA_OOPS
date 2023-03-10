package Array_2D;

public class Rotate_a_Matrix_by_90_Degree {
    public static void main(String[] args) {
        int[][] arr = { { 7, 2, 3 }, { 2, 3, 4 }, { 5, 6, 1 } };
        rotateBy90(arr);
    }

    public static void rotateBy90(int[][] mat) {
        int n = mat.length;
        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                System.out.print(mat[j][i] + " ");
            }
            System.out.println();
        }
    }
}
