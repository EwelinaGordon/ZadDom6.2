import java.util.Arrays;

public class MultiArrayTest {

    public static void main(String[] args) {

        MultiArray table = new MultiArray(2,3);

        table.print();
        table.randomize();
        System.out.println(" ");
        table.print();

        int min = table.findMin();
        System.out.println("Najmniejsza wartość w tablicy: " + min);

        int max = table.findMax();
        System.out.println("Najwieksza wartosc w tablicy: " + max);
    }
}
