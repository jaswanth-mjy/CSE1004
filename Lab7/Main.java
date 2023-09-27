import java.util.*;

public class Main {

    public static void main(String[] args) {
       int[] array1 = {1,2,3};
        int[] array2 = {4,5,6};
        //int n;
        
        /* in = new Scanner(System.in);
        n=in.nextInt();
        int array1[] = new int[n];
        int array2[] = new int[n];*/

        int length = array1.length + array2.length;

        int[] result = new int[length];
        int pos = 0;
        for (int element : array1) {
            result[pos] = element;
            pos++;
        }

        for (int element : array2) {
            result[pos] = element;
            pos++;
        }

        System.out.println(Arrays.toString(result));
    }
}