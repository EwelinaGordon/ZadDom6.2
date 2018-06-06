import java.util.Arrays;
import java.util.Random;

public class MultiArray {

    int[][] table;

    Random random = new Random();

    public MultiArray(int n, int m) {
        this.table = new int[n][m];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                table[i][j] = random.nextInt(10);
            }
        }
    }

    void print() {
        for (int i = 0; i < table.length; i++) {
            System.out.println(Arrays.toString(table[i]));
        }
    }


    int[][] randomize(){
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[1].length; j++) {
                table[i][j] = random.nextInt(10);
            }
        }
           return table;
        }

        int findMin() {
            int min = table[0][0];
            for (int i = 0; i < table.length; i++) {
                for (int j = 0; j < table[1].length; j++) {
                    if (table[i][j] < min) {
                        min = table[i][j];
                    }
                }
            }
            return min;
        }


    int findMax() {
        int max = table[0][0];
        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[1].length; j++) {
                if (table[i][j] > max) {
                    max = table[i][j];
                }
            }
        }
        return max;
    }

    }


