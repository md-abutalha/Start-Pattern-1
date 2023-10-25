package problem_solve.pattern_3;

public class pattern_3 {
    public static void main(String[] args) {
        int size = 6;
        for (int row = 1; row<=size; row++) {
            for (int col = 1; col<=size; col++){
                if (row==col || col+row == size){
                    System.out.print("*");
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println();
        }
    }
}
