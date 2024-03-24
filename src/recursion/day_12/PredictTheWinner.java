package recursion.day_12;

import java.util.ArrayList;
import java.util.List;

public class PredictTheWinner {
    public static void main(String[] args) {

        int n = 5; // Number of persons
        int k = 3;  // Elimination interval
        List<Boolean> person = new ArrayList<>();
        for (int i = 0; i < n; i++)
            person.add(false);
        System.out.println("Winner: " + winner(person, n, 0, n, k));
    }


    public static int winner(List<Boolean> person, int n, int index, int personLeft, int k) {
        if (personLeft == 1) {
            for (int i = 0; i < n; i++) {
                if (person.get(i) == false)
                    return i;
            }
        }

        int kill = (k - 1) % personLeft;
        while (kill-- > 0) {
            index = (index + 1) % n;
            while (person.get(index))
                index = (index + 1) % n;
        }
        person.set(index, true);
        while (person.get(index))
            index = (index + 1) % n;
        return winner(person, n, index, personLeft - 1, k);
    }

    // Method 2
    static int winner_1(int n, int k)
    {
        if (n == 1)
            return 0;
        return (winner_1(n - 1, k) + k) % n;
    }
}
