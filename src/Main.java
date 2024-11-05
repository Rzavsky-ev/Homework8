import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        //Задача 1
        System.out.println("Задача 1");
        //создание массива с помощью ключевого слова new
        int[] arrInt = new int[3];
        for (int i = 0; i <3; i++) {
            arrInt[i] = i+1;
        }

        //массив с дробными числами
        float[] arrFloat = {1.57f, 7.654f, 9.986f};

        //произвольный массив
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(10) + 1;
        }
        System.out.println("--------------------------------------------------------------");

        //Задача 2
        System.out.println("Задача 2");
        for (int i = 0; i < (arrInt.length - 1); i++) {
            System.out.print(arrInt[i] + ", ");
        }
        System.out.print(arrInt[arrInt.length - 1] + ".");
        System.out.println();

        ////////////////////////////////////////////

        for (int i = 0; i < (arrFloat.length - 1); i++) {
            System.out.print(arrFloat[i] + ", ");
        }
        System.out.print(arrFloat[arrFloat.length - 1] + ".");
        System.out.println();

        ///////////////////////////////////////////////////

        for (int i = 0; i < (arr.length - 1); i++) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[arr.length - 1] + ".");
        System.out.println();

        //Задача 3
        System.out.println("Задача 3");
        for (int i = (arrInt.length - 1); i > 0; i--) {
            System.out.print(arrInt[i] + ", ");
        }
        System.out.print(arrInt[0] + ".");
        System.out.println();

        ////////////////////////////////////////////

        for (int i = (arrFloat.length - 1); i > 0; i--) {
            System.out.print(arrFloat[i] + ", ");
        }
        System.out.print(arrFloat[0] + ".");
        System.out.println();
        ///////////////////////////////////////////////////
        for (int i = (arr.length - 1); i > 0; i--) {
            System.out.print(arr[i] + ", ");
        }
        System.out.println(arr[0] + ".");
        System.out.println();

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < arrInt.length; i++) {
            if (arrInt[i] % 2 != 0) {
                arrInt[i] += 1;
            }
        }
        System.out.println(Arrays.toString(arrInt));
    }
}