package recursion.day_12;

import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    public static void main(String[] args) {
        // Example usage:
//        int n = 4; // Example matrix size
//        int[][] matrix = new ArrayList<>();

        // Fill the matrix with appropriate values
        // Example: matrix.get(i).add(value);

        // List to store all possible paths
        List<String> ans = new ArrayList<>();

        // 2D List to track visited cells
//        List<List<Boolean>> visited = new ArrayList<>();
//        for (int i = 0; i < n; i++) {
//            visited.add(new ArrayList<>(n));
//            for (int j = 0; j < n; j++) {
//                visited.get(i).add(false);
//            }
//        }

        // StringBuilder to store current path
        StringBuilder path = new StringBuilder();

        // Find all possible paths starting from (0, 0)
//        total(matrix, 0, 0, n, path, ans, visited);

        // Print all possible paths
        for (String p : ans) {
            System.out.println(p);
        }
    }

    public static ArrayList<String> findPath(int[][] m, int n) {
        // Your code here

        // Your code goes here
        boolean[][] visited = new boolean[n][n];

        ArrayList<String> ans = new ArrayList<>();
        StringBuilder path = new StringBuilder();

        // Check if the start or end cell is blocked
        if (m[0][0] == 0 || m[n - 1][n - 1] == 0)
            return ans;

        total(m, 0, 0, n, path, ans, visited);
        return ans;
    }



    // Define arrays to represent possible moves: Up, Down, Left, Right
    static int[] row = {-1, 1, 0, 0};
    static int[] col = {0, 0, -1, 1};
    // Define corresponding characters for each direction
    static String dir = "UDLR";

    // Function to check if a cell is valid (within the maze boundaries)
    static boolean valid(int i, int j, int n) {
        return i >= 0 && j >= 0 && i < n && j < n;
    }

    // Function to find all possible paths from (i, j) to destination
    static void total(int[][] matrix, int i, int j, int n, StringBuilder path, List<String> ans, boolean[][] visited) {
        // Base case: if we reached the destination, add the path to the answer list
        if (i == n - 1 && j == n - 1) {
            ans.add(path.toString());
            return;
        }

        // Mark the current cell as visited
        visited[i][j] = true;

        // Iterate through all possible moves
        for (int k = 0; k < 4; k++) {
            // Check if the move is valid, unvisited, and there's a path in the matrix
            if (valid(i + row[k], j + col[k], n) && matrix[i + row[k]][j + col[k]] == 1 && !visited[i + row[k]][j + col[k]]) {
                // Add the corresponding direction to the path
                path.append(dir.charAt(k));
                // Recursively explore this path
                total(matrix, i + row[k], j + col[k], n, path, ans, visited);
                // Remove the direction as we backtrack
                path.deleteCharAt(path.length() - 1);
            }
        }

        // Mark the current cell as unvisited (backtrack)
        visited[i][j] = false;
    }
}
