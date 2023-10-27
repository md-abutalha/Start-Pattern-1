package problem_solve;

public class pattern_5 {
    public static void main(String[] args) {
        int size = 4;
        for (int row = 1; row<=size; row++){
            for (int col = 1; col<=row; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

        for (int row = 1; row<=size; row++){
            for (int col=1; col<=size-row; col++){
                System.out.print(" * ");
            }
            System.out.println(" ");
        }

    }
}
