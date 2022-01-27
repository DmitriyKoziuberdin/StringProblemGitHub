import java.sql.SQLOutput;
import java.util.Scanner;

public class FirstModule {
    static Scanner in = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Your array:");
        int size = in.nextInt();
        System.out.println("The size of your array is " + size);
        int [] arr1 = new int[size];
        for (int i = 0, k = 1; i < arr1.length ; i++, k++) {
            arr1[i] = k;
            System.out.println(arr1[i]);
        }

    }
}
