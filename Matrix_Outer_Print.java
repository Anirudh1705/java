public class Matrix_Outer_Print {
    public static void main(String[] args) {
        int [][]matrix = {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };
        System.out.println("Given Matrix: ");
        for (int[] row : matrix) {
            for (int element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
        int n = matrix.length;
        int m = matrix[0].length;
        for (int i =0;i<n;i++){
            for (int j =0; j<m;j++){
                if (i==0 || i == n-1 || j==0 || j==m-1){
                    System.out.print(matrix[i][j]+"\t");
                }
                else {
                    System.out.print("\t");
                }
            }
            System.out.println("\t");
        }
    }
}
