class UniquePaths{

    public int uniquePaths(int m, int n) {
        return countPath(m-1,n-1);
    }
    int countPath(int row,int col){
        if(row==0 | col == 0){
            return 1;
        }
        return countPath(row-1,col) + countPath(row , col-1);
    }

}