package multidimensional_arrays.day_2;

import java.util.ArrayList;
import java.util.List;

public class SpiralForm {
    public static void main(String[] args) {

    }

    public static List<Integer> spiralOrder(int[][] matrix) {

        List<Integer> ans = new ArrayList<>();
        int row = matrix.length, col = matrix[0].length;
        int top = 0, bottom = row-1, left = 0, right = col-1;

        while(left <= right && top <= bottom){
            // print top
            for(int j = left; j<=right; j++)
                ans.add(matrix[top][j]);
            top++;

            // print right
            for(int i = top; i<= bottom; i++)
                ans.add(matrix[i][right]);
            right--;

            // print bottom
            if(top <= bottom){
                for(int j=right; j>=left; j--)
                    ans.add(matrix[bottom][j]);
                bottom--;
            }


            // print left
            if(left <= right){
                for(int i=bottom; i>=top; i--)
                    ans.add(matrix[i][left]);
                left++;
            }


        }
        return ans;
    }
}
