public class psof2darray {
    
    /**
     * @param args
     */
    public static void main(String[] args) {
        //q1
        int[][] nums={{4,7,8},{8,8,7}};
        int count=0;
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[0].length-1;j++){
                if(nums[i][j]==7){
                    count++;

                }

            }
        }
        System.out.println("count of 7 is:"+count);
        //q 2
        int [][]nums={{1,4,9},{11,4,3},{2,2,3}};
        int sum=0;
        //sum of 2nd row
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[1][j];
        }
        System.out.println("sum is:"+sum);
        //sum of 3rd row
        for(int j=0;j<nums[0].length;j++){
            sum+=nums[2][j];
        }
        System.out.println("sum is:"+sum);
        //sum of 2nd col
        for(int i=0;i<nums.length;i++){
            sum+=nums[i][1];
        }
        System.out.println("sum is:"+sum);
        
        //q 3
        int row=2,col=3;
        int [][] matrix={{2,3,7},{5,6,7}};
        //display original
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        //transpose of matrix
        int trans[][]=new int[col][row];
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                trans[j][i]= matrix[i][j];

            }
        }
        //printing 
        for(int i=0;i<trans.length;i++){
            for(int j=0;j<trans[0].length;j++){
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
        int matrix[][]=new int[4][];
        matrix[0]=new int[2];
        matrix[1]=new int[5];
        matrix[2]=new int[7];
        
        for(int r=0;r<matrix.length;r++){
            matrix[r]=matrix[r+1];
            for(int c=0;c<matrix[0].length;c++){
                System.out.print(matrix[r][c]+" ");
            }
            System.out.println();
        }
        int matrix[][]={{2,3,4},{5,9,6},{9,3,6}};
        int row=3,col=3;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        int transpose[][]=new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                transpose[j][i]=matrix[i][j];
                
            }
        }
        for(int i=0;i<transpose.length;i++){
            for(int j=0;j<transpose[0].length;j++){
                System.out.print(transpose[i][j]+" ");
            }
            System.out.println();
        }
        int matrix[][]={{2,4,5,2},{7,9,5,0},{6,9,3,9},{4,9,23,1}};
        int target=23;
        int n=matrix.length;
        int m=matrix[0].length;
        int row=0;
        int col=m-1;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==target){
                    System.out.println("found"+target+"at positon"+"("+row+","+col+")");
                }
                else if(matrix[i][j]>target){
                    col--;
                }
                else{
                    row++;
                }
                
    
            }
           
        }
        




        


    }

}
