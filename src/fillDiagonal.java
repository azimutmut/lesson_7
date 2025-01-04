public class fillDiagonal {
    public static void main(String[] args) {
        int[][] arr = new int[5][5];
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                  if(i+j==4){
                    System.out.print("1  ");
                }else if (i==j){
                    System.out.print("1  ");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

}
