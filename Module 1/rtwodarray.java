public class rtwodarray {
    public static void main(String[] args) {
        
        int[][] matrix = {
            {10, 8, 2003},
            {03, 8, 03},
            {7, 8, 9}
        };

        System.out.println("2D Array Elements:");

        
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); 
        }
    }
}
