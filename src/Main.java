import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
// 1
        System.out.println("Задача 1-2: ");
        int[] arr = {1, 2, 3};
        for (int i = 0; i < arr.length; i++) {
            if (i == arr.length - 1) {
                System.out.println(arr[i]);
                break;
            }
            System.out.print(arr[i] + ", ");
        }
//2
        double[] arr1 = {1.57, 7.654, 9.986};
        for (int i = 0; i < arr1.length; i++) {
            if (i == arr1.length - 1) {
                break;
            }
        }
        System.out.println(Arrays.toString(arr1).replace("[", "").replace("]", ""));
// 3
        Random rand = new Random();
        int[] arr2 = {rand.nextInt(10), rand.nextInt(10), rand.nextInt(10)};
        for (int i = 0; i < arr2.length; i++) {
            if (i == arr2.length - 1) {
                System.out.println(arr2[i]);
                break;
            }
            System.out.print(arr2[i] + ", ");
        }
// revers 1
        System.out.println("Задача 3: реверс");
        int[] arr3 = {1, 2, 3};
        int[] revArr3 = new int[arr3.length];
        for (int i = 0; i < arr3.length; i++) {
            revArr3[i] = arr3[arr3.length - 1 - i];
            if (i == revArr3.length - 1) {
                System.out.println(revArr3[i]);
                break;
            }
            System.out.print(revArr3[i] + ", ");
        }
// revers 2
        double[] arr4 = {1.57, 7.654, 9.986};
        double[] revArr4 = new double[arr4.length];
        for (int i = 0; i < arr4.length; i++) {
            revArr4[i] = arr4[arr4.length - 1 - i];
            if (i == revArr4.length - 1) {
                break;
            }
        }
        System.out.println(Arrays.toString(revArr4).replace("[", "").replace("]", ""));
// revers 3
        int[] revArr5 = new int[arr2.length];
        for (int i = 0; i < arr2.length; i++) {
            revArr5[i] = arr2[arr2.length - 1 - i];
            if (i == revArr5.length - 1) {
                System.out.println(revArr5[i]);
                break;
            }
            System.out.print(revArr5[i] + ", ");
        }
        System.out.println("Задача 4: ");
        int[] arr7 = {1, 2, 3};
        for (int i = 0; i < arr7.length; i++) {
            if (arr7[i] % 2 != 0) {
                arr7[i]++;
            }
            System.out.print(arr7[i] + ", ");
        }
    }

}



