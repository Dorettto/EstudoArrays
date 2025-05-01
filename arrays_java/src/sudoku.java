public class sudoku {
    public static void main(String[] args) {
        // Array Multidimensional
        int [][] sudoku = {{3,6,7},{4,9,8},{5,2,1}};
 
        // Opção 1 para percorrer
        for (int i = 0; i < sudoku.length; i++){
            for (int j = 0; j < sudoku[i].length; j++){
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
        System.err.println("-----");
        //Opção 2 para percorrer
        for (int[] linhaSudoku : sudoku){
            for (int numero : linhaSudoku){
                System.out.print(numero + " ");
            }
            System.out.println();
        }
    }
}
