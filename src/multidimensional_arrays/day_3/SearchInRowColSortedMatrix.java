package multidimensional_arrays.day_3;

public class SearchInRowColSortedMatrix {
    public static void main(String[] args) {

    }

    static boolean search(int matrix[][], int n, int m, int x)
    {
        // code here
        int row = 0;
        int col = m - 1;
        while(row < n && col >= 0)
        {
            if(matrix[row][col] == x){
                return true;
            }
            else if(matrix[row][col] < x){
                row++;
            }
            else {
                col--;
            }
        }
        return false;
    }
}
