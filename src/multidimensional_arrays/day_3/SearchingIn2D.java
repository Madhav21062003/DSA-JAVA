package multidimensional_arrays.day_3;

public class SearchingIn2D {
    public static void main(String[] args) {

        int[][] matrix = {{2,6,10,14,18},
                          {20,24,27,29,38},
                          {47,52,78,93,102},
                          {108,111,200,218,320}};

        int key = 53;


        System.out.println(searchMethodOne(matrix,4,5,key));
        System.out.println(searchMethodTwo(matrix,4,5,key));

    }

    // Bruteforce Approach
    static boolean searchMethodOne(int[][] matrix, int row, int col, int key){
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == key){
                    return true;
                }
            }
        }
        return false;
    }

    // Using Binary Search
    static boolean searchMethodTwo(int[][] matrix, int row, int col, int key){
        for (int i = 0; i < row; i++) {
            if (matrix[i][0] <= key && matrix[i][col-1] >= key){
                int start = 0, end = col-1;
                while (start <= end){
                    int mid = start + (end - start) / 2;

                    if (matrix[i][mid] == key){
                        return true;
                    } else if (matrix[i][mid] < key){
                        start = mid + 1;
                    }
                    else
                        end = mid -1;
                }
                return false;
            }
        }
        return true;
    }

}
