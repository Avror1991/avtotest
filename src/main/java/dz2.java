import java.util.Scanner;

public class dz2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.print("Введи число для массива ");
        int num = in.nextInt();

        in.close();

        int[] array = new int[num];

        for (int i = 0; i < array.length; i++) {
            array[i] = (int) Math.round((Math.random() * 10));
            System.out.println(array[i]);

        }
    }
}
