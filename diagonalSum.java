public class diagonalSum {
    public static int sumofdiagonal(int matrix[][]){
        /* in this case tc is n^2 not good
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length-1;j++){
            //pd
                if(i==j){
                    sum+=matrix[i][i];
                }
                    //sd
                else if(i+j==matrix.length-1){
                    sum+=matrix[i][matrix.length-1-i];
                }
            }
        }
        return sum;*/
        int sum=0;
        for(int i=0;i<matrix.length;i++){
            //pd
            sum+=matrix[i][i];
            //sd
            if(i!=matrix.length-1-i)
                sum+=matrix[i][matrix.length-1-i];

        }return sum;
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        int result=sumofdiagonal(matrix);
        System.out.println("sum is:"+result);

    }
    
}
