package problem_solve;

public class pattern_4 {
    public static void main(String[] args) {
        int size = 4;
        for(int row = 0; row<size; row++){
            for (int col = 0; col<size-row; col++){
                System.out.print("  *  ");

            }
            System.out.println(" ");
        }
    }
}
