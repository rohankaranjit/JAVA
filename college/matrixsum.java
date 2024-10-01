





public class TwoD {
    public static void main(String[] args) throws Exception{
        int[][] matrix = new int[][] {{1,2,3},{4,5,7},{8,9,5}};
        
        for (int i = 0; i < 3; i++) {
            int sum = 0;
            for(int j = 0 ; j<3;j++){
               System.out.print(matrix[i][j]+ " ");
                sum += matrix [i][j];
           }
            System.out.println("Sum or row" + (i+1) + "; " + sum);

       }

    }
    
   
}
