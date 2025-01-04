public class fillDiagonal {
    public static void main(String[] args) {
        int[][] arr = new int[7][7];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                  if(i+j==6){
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
