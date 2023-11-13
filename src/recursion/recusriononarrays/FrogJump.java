package recursion.recusriononarrays;

public class FrogJump {
    public static void main(String[] args) {

        int[] height = {10, 30, 40, 20};
        System.out.print("The minimum cost to reach at the destination is: ");
        System.out.println(frogJump(height, height.length, 0));
    }

    static int frogJump(int[]height, int n, int index){
        // base case
        if (index == n-1)
            return 0;

        // if the frog jump from current ith index to i+1 index
        int option_1 = Math.abs(height[index] - height[index + 1]) + frogJump(height,n, index+1);

        // extra base case ; if we stand at the second last position then in that case we don't need to go to the n-2th position
        if (index == n-2)
            return option_1;

        // if the frog jumps from current ith index to i+2 th index
        int option_2 = Math.abs(height[index] - height[index+2]) + frogJump(height, n, index+2);

        // return the Minimum of both the answer
        return Math.min(option_1, option_2);
    }
}
