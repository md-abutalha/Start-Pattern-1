package problem_solve;

public class pattern_1 {
    public static void main(String[] args) {
        System.out.println("Hello Talha");
        int size = 5;

        for(int row = 1; row<size; row++){
        for (int col = 1; col<size; col++ ){
            if(row==1 || row == size-1 || col ==1 || col == size-1 ){
                System.out.print("  *  ");
            }else {
                System.out.print("     ");
            }
        }
            System.out.println();
        }
    }
}
